public class ReadFiles {
    public static void main(String[] args) {
        String[] files = //here give your appropirate files;

       FileScanner fileScanner = new FileScanner(files);

       fileScanner.wordCount();
    }
}
