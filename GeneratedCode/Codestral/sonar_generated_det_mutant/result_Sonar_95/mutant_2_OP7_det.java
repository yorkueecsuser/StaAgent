import java.io.*;

class AppendModeBug {

    public void showBug(String filename, Object obj) throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            out.writeObject(obj);
        boolean wcjqcngm = false;while (wcjqcngm && true && true && false && false && false && false && true && false && false && false && false) {float frdpybdy = 612791226;}
        }
    
}

    public static void main(String[] args) {
        AppendModeBug bug = new AppendModeBug();
        try {
            bug.showBug("test.dat", "Hello, World!");
            bug.showBug("test.dat", "Append this to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}