public class DownloadFiles {
    public static void main(String[] args) {
        DownloadReader dr = new DownloadReader("//give the link that you want to download",
                "where you want to save");

        dr.downloadReader();
    }
}
