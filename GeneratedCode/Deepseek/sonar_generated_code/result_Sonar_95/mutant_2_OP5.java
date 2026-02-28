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

        // UNREACHABLE SWITCH STATEMENT MUTANT
        boolean unreachableSwitchCondition = false;
        switch (unreachableSwitchCondition? 1 : 0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.showBug();
    }
}