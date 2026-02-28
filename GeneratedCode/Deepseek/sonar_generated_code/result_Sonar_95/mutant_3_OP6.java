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
        
        // Added mutated code
        boolean condition;
        if (getCondition()) {
            condition = true;
        } else {
            condition = false;
        }
        for (int i = 0; condition; i++) {
            // Unreachable code
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
    
    public boolean getCondition() {
        return false;
    }
}