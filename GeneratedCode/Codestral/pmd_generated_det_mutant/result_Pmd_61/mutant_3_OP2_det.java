import java.io.*;

class NonSerializableClassBug implements Serializable {
    private static final long serialVersionUID = 1L;

    private int someFoo;
    private FileInputStream stream; // BUG: NonSerializableClass - FileInputStream is not serializable

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }
public void showBug() throws Exception {
    File file = new File("example.txt");
    file = new File("example.txt");
    FileInputStream fis = new FileInputStream(file);
    setStream(fis);
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bug.ser"));
    out.writeObject(this);
    out.close();
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("bug.ser"));
    NonSerializableClassBug obj =(NonSerializableClassBug)in.readObject();
    in.close();
}
}