import java.util.Random;

class StringBuilderInitWithCharBug {

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);
        char deadStore = randomChar(); // Adding the dead store variable
        return sb;
    }

    // Helper method to generate a random character
    private char randomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length());
    }
}