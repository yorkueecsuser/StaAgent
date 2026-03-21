import java.util.Random;

class IntegerRemainderBug {
    public int showBug(int i) {
        int unusedVar; // Dead store mutation
        return i % 60 * 1000; // Buggy line
    }

    // This method generates a random string of eight characters for the dead store mutation
    private String generateRandomString() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(8);
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}