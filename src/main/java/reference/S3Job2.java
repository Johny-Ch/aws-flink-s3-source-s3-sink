package reference;

import org.apache.flink.api.common.serialization.SimpleStringEncoder;
import org.apache.flink.api.common.typeinfo.BasicTypeInfo;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.io.RowCsvInputFormat;
import org.apache.flink.core.fs.Path;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.filesystem.StreamingFileSink;
import org.apache.flink.streaming.api.functions.source.FileProcessingMode;

public class S3Job2 {

    private static final String s3InputPath = "s3://ast-poc-bucket/input/";

    private static final String s3OutputPath = "s3://ast-poc-bucket/kda/output/";

    private static final String s3CheckpointPath = "s3://ast-poc-bucket/kda/checkpoint/";

    private static StreamingFileSink<String> createS3SinkFromStaticConfig() {
        return StreamingFileSink
                .forRowFormat(new Path(s3OutputPath), new SimpleStringEncoder<String>("UTF-8"))
                .build();
    }
    public static void main(String[] args) throws Exception {

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        String path = s3InputPath;
        TypeInformation[] fieldTypes = new TypeInformation[]{BasicTypeInfo.STRING_TYPE_INFO};
        RowCsvInputFormat csvFormat = new RowCsvInputFormat(new Path(path), fieldTypes);
        csvFormat.setNestedFileEnumeration(true);
        csvFormat.setDelimiter(",");
        csvFormat.setFieldDelimiter(",");
        DataStream lines = env.readFile(csvFormat, path, FileProcessingMode.PROCESS_CONTINUOUSLY, -1);
        lines.map(value -> value).print();
        lines.addSink(createS3SinkFromStaticConfig());
        env.execute("S3Job2");
    }
}
