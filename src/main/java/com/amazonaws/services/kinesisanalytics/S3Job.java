package com.amazonaws.services.kinesisanalytics;

import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.filesystem.StreamingFileSink;
import org.apache.flink.streaming.api.functions.source.FileProcessingMode;

public class S3Job {

    private static final String s3InputPath = "s3://ast-poc-bucket/input/";

    private static final String s3OutputPath = "s3://ast-poc-bucket/kda/output/";

    private static final String s3CheckpointPath = "s3://ast-poc-bucket/kda/checkpoint/";
    public static void main(String[] args) throws Exception {

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.getCheckpointConfig().setCheckpointStorage(s3CheckpointPath);

        DataStream<String> stringDataStream = env.readTextFile(s3InputPath);

        stringDataStream.writeAsText(s3OutputPath);

//        stringDataStream.addSink(StreamingFileSink
//                .forRowFormat(new Path(s3OutputPath), new SimpleStringEncoder<String>("UTF-8"))
//                .build());

        env.execute("S3Job");
    }
}
