import java.io.*;

public class ReadFiles {
    public static void main(String[] args) {
        String[] files = {"100mb.txt", "100mb.txt", "100mb.txt"};

       FileScanner fileScanner = new FileScanner(files);

       fileScanner.wordCount();
    }
}
