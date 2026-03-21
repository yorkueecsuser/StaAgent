import java.io.*;

class ObjectOutputStreamBug {
public void showBug() throws IOException {
    FileOutputStream fileOut = new FileOutputStream("test.txt" , true);
    fileOut = new FileOutputStream("test.txt" , true);
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject("test");
    out.close();
}

    public static void main(String[] args) throws IOException {
        ObjectOutputStreamBug bug = new ObjectOutputStreamBug();
        bug.showBug();
    }
}