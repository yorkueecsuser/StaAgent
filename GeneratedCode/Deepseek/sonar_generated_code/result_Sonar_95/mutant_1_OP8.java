import java.io.*;

class Main {
    public void showBug() throws Exception {
        File f = new File("test.ser");

        // Mutant: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fo = new FileOutputStream(f, true);
        ObjectOutputStream out = new ObjectOutputStream(fo);

        out.writeObject("bug");
        out.close();
        fo.close();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
}