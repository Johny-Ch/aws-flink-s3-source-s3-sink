package com.amazonaws.services.kinesisanalytics;

import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.filesystem.StreamingFileSink;
import org.apache.flink.streaming.connectors.kinesis.FlinkKinesisConsumer;
import org.apache.flink.streaming.connectors.kinesis.config.ConsumerConfigConstants;

import java.util.Properties;

public class S3StreamingSinkJobTransform {
    private static final String region = "us-east-1";
    private static final String inputStreamName = "ast-poc-kda-input-kstream";
    private static final String s3SinkPath = "s3a://ast-poc-bucket/kda/output/";

    private static DataStream<Player> createSourceFromStaticConfig(StreamExecutionEnvironment env) {

        Properties inputProperties = new Properties();
        inputProperties.setProperty(ConsumerConfigConstants.AWS_REGION, region);
        inputProperties.setProperty(ConsumerConfigConstants.STREAM_INITIAL_POSITION, "TRIM_HORIZON");

        return env.addSource(new FlinkKinesisConsumer<>(inputStreamName,
                (DeserializationSchema) new Player(),
                inputProperties));
    }

    private static StreamingFileSink<OutPlayer> createS3SinkFromStaticConfig() {
        return StreamingFileSink
                .forRowFormat(new Path(s3SinkPath), new SimpleStringEncoder<OutPlayer>("UTF-8"))
                .build();
    }

    public static void main(String[] args) throws Exception {

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<Player> input = createSourceFromStaticConfig(env);

        input.map(player -> {
            return new OutPlayer(player);
        }).addSink(createS3SinkFromStaticConfig());

        env.execute("S3StreamingSinkJobTransform");
    }
}
