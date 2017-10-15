import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
public class WordCount {
 public static void main(String[] args) throws Exception {
 Configuration conf = new Configuration();
 String[] programArgs =
 new GenericOptionsParser(conf, args).getRemainingArgs();
 if (programArgs.length != 2) {
 System.err.println("Usage: Wordcount <in> <out>");
 System.exit(2);
 }
 Job job = Job.getInstance(conf, "Word Vowel Count");
 job.setJarByClass(WordCount.class);
 job.setMapperClass(WordCountMapper.class);
 job.setReducerClass(WordCountReducer.class);
 job.setOutputKeyClass(Text.class);
 job.setOutputValueClass(IntWritable.class);
 FileInputFormat.addInputPath(job, new Path(programArgs[0]));
 FileOutputFormat.setOutputPath(job, new Path(programArgs[1]));
 // Submit the job and wait for it to finish.
 System.exit(job.waitForCompletion(true) ? 0 : 1);
 }
}