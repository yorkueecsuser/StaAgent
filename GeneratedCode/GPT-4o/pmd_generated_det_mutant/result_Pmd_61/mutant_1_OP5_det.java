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
        int wilzeyml = 0;switch  (wilzeyml) {case 1:String vdesepzw = "sjrmozwp";break;default:double ovgukfsw = -338808533;break;}
        System.out.println("This method demonstrates the bug in the NonSerializableExample class.");
    
}
}