import java.util.Random;

class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c); // BUG: StringBuilderInitWithChar
        int deadStoreVariable = generateRandomInt(); // Dead Store variable
        return sb;
    }

    // Method to generate random integer
    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100000000);
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length()); // This should print 97, not 1.
    }
}