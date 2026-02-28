import java.util.Random;

class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String deadStore = generateRandomString(8); // Generated Dead Store
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private String generateRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}