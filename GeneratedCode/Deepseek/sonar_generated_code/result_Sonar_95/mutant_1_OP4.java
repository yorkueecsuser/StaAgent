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

        // Mutation Operator: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code is reachable");
        } else {
            // Unreachable code added to ensure that the if-else statement is unreachable
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }

    // Method to generate a random condition
    public boolean getCondition() {
        return Math.random() < 0.5;
    }
}