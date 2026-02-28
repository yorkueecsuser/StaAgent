import java.util.Random;

class RegularExpressionBug {
    public String showBug(String input) {
        String unusedVariable = generateRandomString(8); // Dead Store mutation
        String output = input.replace(".", "|"); // Original bug
        return output;
    }

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