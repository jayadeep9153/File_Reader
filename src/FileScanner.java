import java.io.*;

public class FileScanner {
    String[] files;
    long totalWords;
    long totalTime;

    public FileScanner(String[] files){
        this.files = files;
        this.totalWords = 0;
        this.totalTime = 0;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public long getTotalWords() {
        return totalWords;
    }

    public void wordCount(){
        long startTime = System.currentTimeMillis();


        for(String file : files){
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while((line = br.readLine()) != null){
                    String[] words = line.trim().split("\\s+");
                    if(!line.isEmpty()){
                        totalWords += words.length;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        long endTime = System.currentTimeMillis();
        this.totalTime = (endTime - startTime);
        double timeInSec = totalTime / 1000.0;

        System.out.println("Total words : " + totalWords);
        System.out.println("Total time in milliseconds " + this.totalTime + " ms");
        System.out.println("Total time in seconds " + timeInSec + " s");
    }
}
