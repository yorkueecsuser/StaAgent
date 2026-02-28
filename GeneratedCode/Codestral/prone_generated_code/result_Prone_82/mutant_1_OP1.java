import java.util.Random;

class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        String deadStoreVariable = generateRandomString();
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}