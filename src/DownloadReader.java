import java.io.*;
import java.net.*;

public class DownloadReader {
    String fileUrl;
    String saveAs;
    long totalTime;


    public DownloadReader(String fileUrl, String saveAs){
        this.fileUrl = fileUrl;
        this.saveAs = saveAs;
        this.totalTime = totalTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public String getSaveAs() {
        return saveAs;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setSaveAs(String saveAs) {
        this.saveAs = saveAs;
    }

    public void downloadReader(){
        String fileUrl = this.fileUrl;
        String saveAs = this.saveAs;
        long startTime = System.currentTimeMillis();

        try(BufferedInputStream in = new BufferedInputStream(new URL(fileUrl).openStream());
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveAs))) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while((bytesRead = in.read(buffer, 0, buffer.length)) != -1){
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Failed to download file");
        }

        long endTime = System.currentTimeMillis();
        this.totalTime = endTime - startTime;
        double timeInSec = (double) totalTime / 1000.0;

        System.out.println("Total time in milliseconds " + this.totalTime + " ms");
        System.out.println("Total time in seconds " + timeInSec + " s");
    }
}
