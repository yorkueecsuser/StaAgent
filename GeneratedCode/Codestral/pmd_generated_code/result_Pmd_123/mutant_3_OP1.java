import java.util.Random;

class StringBufferLengthBug {
    public boolean showBug(StringBuffer sb) {
        Random random = new Random(); // New Random object for generating a random string
        char[] randomChars = new char[8];
        for (int i = 0; i < 8; i++) {
            randomChars[i] = (char) (random.nextInt(26) + 'a'); // Generating random characters [a-z]
        }
        String deadStore = new String(randomChars); // Generating the dead store variable

        if (sb.toString().equals("")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        boolean result = bugInstance.showBug(sb);
        System.out.println("Buggy code result: " + result);
    }
}