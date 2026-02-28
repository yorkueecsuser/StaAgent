import java.util.Random;

class StringIndexOutOfBoundsBug {
    public int showBug(String text, int beginIndex, int endIndex) {
        // Dead Store mutation operator applied
        int unusedVar = generateRandomNumber();

        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", endIndex, beginIndex); // beginIndex > endIndex
    }

    public int showBug2(String text, int beginIndex) {
        // Dead Store mutation operator applied
        String unusedStr = generateRandomString();

        // BUG: "String.indexOf" should be used with correct ranges
        return text.indexOf("bug", beginIndex); // beginIndex < 0
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}