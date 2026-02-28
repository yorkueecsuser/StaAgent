import java.io.*;

class Main {
    public void showBug() throws Exception {
        File file = new File("test.ser");

        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject("bug");
        
        // Mutated Code
        switch(getValue()) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        out.close();
        fileOut.close();
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }

    // Helper method to generate a random integer
    private int getValue() {
        return (int) (Math.random() * 10);
    }
}