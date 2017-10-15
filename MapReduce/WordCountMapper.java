import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class WordCountMapper extends
 Mapper<LongWritable, Text, Text, IntWritable> {
 @Override
 public void map(LongWritable key, Text value, Context context)
 throws IOException, InterruptedException {
	 String line = value.toString();
	StringTokenizer tokenString = new StringTokenizer(line, " ");
		String key1 = null;
		int sum =0;
			Set<String> patterns = new HashSet<String>();
		patterns.add(",");
		patterns.add("-");
		patterns.add("=");
		patterns.add("+");
		patterns.add(",");
		patterns.add("_");
		patterns.add(";");
		patterns.add(":");

		while (tokenString.hasMoreTokens()) {
			key1 = tokenString.nextToken();
			if (isVowel(key1))
			{
				for(String pattern:patterns)
				{
				key1= key1.replace(pattern, "");
				}
				context.write(new Text(key1), new IntWritable(1));
			}
		}
		

 }
 
 private static boolean isVowel(String value) {
		// TODO Auto-generated method stub
		if (value.startsWith("a") || value.startsWith("e") || value.startsWith("o") || value.startsWith("u")
				|| value.startsWith("i"))
		{
			return true;
		}
			return false;
	}
}