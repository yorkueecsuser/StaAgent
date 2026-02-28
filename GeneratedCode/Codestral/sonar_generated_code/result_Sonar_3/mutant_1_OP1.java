import java.util.Random;

class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        String deadStore = generateRandomString();
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        int deadStore = generateRandomInt();
        return text.indexOf("bug", beginIndex); // beginIndex < 0
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

    private int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}