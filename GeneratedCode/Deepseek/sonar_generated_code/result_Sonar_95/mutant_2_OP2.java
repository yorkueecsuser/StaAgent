import java.io.*;

class Main {
    public void showBug() throws Exception {
        File file = new File("test.ser");

        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        // Mutation: Duplicated the assignment statement
        FileOutputStream fileOut2 = new FileOutputStream(file, true);
        ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);

        out.writeObject("bug");
        out2.writeObject("bug");
        out.close();
        out2.close();
        fileOut.close();
        fileOut2.close();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
}