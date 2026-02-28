import java.io.*;

class Main {
    public void showBug() throws Exception {
        File file = new File("test.ser");

        // Mutant: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream(file, true);
        ObjectOutputStream s1337 = new ObjectOutputStream(fileOut);

        s1337.writeObject("bug");
        s1337.close();
        fileOut.close();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
}