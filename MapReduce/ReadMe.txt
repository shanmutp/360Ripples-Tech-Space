1. Develop the mapper , reducer and the engine class
2. compile the java class using the command javac -cp `hadoop classpath` *.java3. jar the class files using jar cf <jar name>.jar *.class 
4. make the jar executable chmod 777 *.jar
5. switch to hdfs user su hdfs
6. run the engine class
hadoop jar ./<jar file name>.jar <engine class> <Input file>
<output file>
7. go to the output file path and you can find a file named part-r-00000 with the required output.