import java.io.File;

class FileOperations {
protected void createDirectory() {
    String storageLocation = "/sdcard/mypackage";
    storageLocation = "/sdcard/mypackage";
    File directory = new File(storageLocation);
    if(! directory.exists()){ directory.mkdirs(); }
}

    public void showBug() {
        createDirectory();
    }
}