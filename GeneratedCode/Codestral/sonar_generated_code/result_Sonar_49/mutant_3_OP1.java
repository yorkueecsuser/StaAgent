import java.util.Random;

class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        // Added dead store
        String deadStore = generateRandomString(8);

        return actual.equals(expected)? "No error" : "Description";
    }

    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}