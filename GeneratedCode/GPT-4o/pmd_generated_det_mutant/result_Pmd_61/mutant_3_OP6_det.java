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
        for  (int nuxyyzsl = 0; nuxyyzsl < 0; nuxyyzsl++) {boolean etmctjdz = true;}
        System.out.println("This method demonstrates the bug in the NonSerializableExample class.");
    
}
}