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
        
        // Added mutant code
        for (boolean condition = false; condition; condition = getCondition()) {
            // do nothing
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }

    // Helper method to get a condition
    public boolean getCondition() {
        return false;
    }
}