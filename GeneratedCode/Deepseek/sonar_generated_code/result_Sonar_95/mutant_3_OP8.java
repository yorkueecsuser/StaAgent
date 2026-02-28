import java.io.*;

class Main {
    public void showBug() throws Exception {
        File file = new File("test.ser");

        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject("bug");
        out.close();
        fileOut.close();
    }

    public void m_showBug() throws Exception { // Mutant Method name: m_showBug
        File r = new File("test.ser"); // Renaming: file -> r

        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream(r, true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject("bug");
        out.close();
        fileOut.close();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
        m.m_showBug(); // Mutant Call
    }
}