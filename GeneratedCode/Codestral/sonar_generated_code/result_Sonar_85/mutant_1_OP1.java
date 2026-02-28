import java.util.Random;

class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        // Dead store mutation
        String deadStore = generateRandomString(8);
        return str.substring(index, str.length());
    }

    public char showBugCharAt(String str, int index) {
        // Dead store mutation
        int deadStore = 0;
        return str.charAt(index);
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