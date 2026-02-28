import java.io.*;

class Main {
    public void showBug() throws Exception {
        File file = new File("test.ser");

        FileOutputStream fileOut = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject("bug");
        out.close();
        fileOut.close();

        // Mutant code: Unreachable if statement
        boolean condition = false;
        if(condition) {
            // Do nothing
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
}