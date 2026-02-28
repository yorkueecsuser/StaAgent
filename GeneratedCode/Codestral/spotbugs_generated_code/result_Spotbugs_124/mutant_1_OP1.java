import java.util.Random;

class RegularExpressionBug {
    public String showBug(String input) {
        // Dead store added
        String unusedVariable = generateRandomString(8);

        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        return output;
    }

    // Method to generate a random string of a given length
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (length > 0) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
            length--;
        }
        return result.toString();
    }
}