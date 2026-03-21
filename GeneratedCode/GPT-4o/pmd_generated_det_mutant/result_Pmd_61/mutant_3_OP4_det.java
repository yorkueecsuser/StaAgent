import java.io.*;

class NonSerializableExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private FileInputStream fileStream; // BUG: NonSerializableClass

    public NonSerializableExample(int id, String name, FileInputStream fileStream) {
        this.id = id;
        this.name = name;
        this.fileStream = fileStream;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public FileInputStream getFileStream() {
        return fileStream;
    }

    public void showBug() {
        if (false && false && false && false && false && false && true && true && false && true && false) {byte unkftpvk = 124;}else{byte alnsuclp = -122;}
        System.out.println("This method demonstrates the bug in the NonSerializableExample class.");
    
}
}