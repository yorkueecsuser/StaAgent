import java.util.Random;

class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds

        // Mutation Operator (Dead Store): Inserting unused variable with one primitive type
        String unusedString = generateRandomString();

        char c = myString.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }

    // Function to generate random string
    public static String generateRandomString() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        char[] text = new char[8];
        for (int i = 0; i < 8; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }

        return new String(text);
    }
}