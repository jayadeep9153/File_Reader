public class DownloadFiles {
    public static void main(String[] args) {
        DownloadReader dr = new DownloadReader("https://libgen.li/get.php?md5=a9d8a3c7d886b2ba675fd17bfabcd47c&key=AMX4B3M690VPBIIK",
                "Head First Java.pdf");

        dr.downloadReader();
    }
}
