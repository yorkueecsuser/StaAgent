import java.util.Random;

class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        // Dead Store Mutation: Adding an unused variable
        String deadStore = generateRandomString(8); // Generates a random string of 8 characters
        return input.charAt(index) + "";
    }

    // Method to generate a random string of specified length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        while(length > 0) {
            Random rand = new Random();
            result.append(characters.charAt(rand.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}