import java.io.*;

public class ExampleReader {
    public static void main(String[] args) {
        String[] files = {"100mb.txt", "100mb.txt", "100mb.txt", "100mb.txt" , "100mb.txt"};

        long startTime = System.currentTimeMillis();
        long wordCount = 0;

        for(String file : files){
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while((line = br.readLine()) != null){
                    line = line.trim();
                    if(line.isEmpty()) continue;
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Number of words in text file: " + wordCount);
    }
}
