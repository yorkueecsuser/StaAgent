import java.util.Random;

class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);

        // Mutation Operator: Dead Store
        String deadStoreVar = generateRandomString(8); // Generates a random string of 8 characters
    }

    // Helper method to generate a random string of a given length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}