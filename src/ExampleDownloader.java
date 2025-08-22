import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class ExampleDownloader {
    public static void main(String[] args) {
        String fileURL = "https://www.w3.org/TR/PNG/iso_8859-1.txt"; // URL of the file to download
        String saveAs = "downloaded_file.txt";                        // Local file name

        try (BufferedInputStream in = new BufferedInputStream(new URL(fileURL).openStream());
             FileOutputStream out = new FileOutputStream(saveAs)) {

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            // Read chunks from input stream and write to file
            while ((bytesRead = in.read(buffer, 0, buffer.length)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("File downloaded successfully as: " + saveAs);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to download file.");
        }
    }
}
