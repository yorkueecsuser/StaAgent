import java.io.*;

class Main {
    public void showBug() throws Exception {
        File file = new File("test.ser");

        FileOutputStream fileOut = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject("bug");
        out.close();
        fileOut.close();

        // Mutation: Unreachable switch statement
        int mutantValue = 0;
        switch (mutantValue) {
            case 0:
                System.out.println("Unreachable code");
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
}