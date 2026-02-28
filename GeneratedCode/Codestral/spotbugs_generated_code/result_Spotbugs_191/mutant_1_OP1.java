import java.util.Random;

class MutableStaticField {
    public static String sensitiveData = "Confidential Data";
    // BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)

    public static String performSensitiveOperation() {
        return "Performing sensitive operation with data: " + sensitiveData;
    }

    public static void showBug() {
        System.out.println(performSensitiveOperation());

        // Malicious code modifies the static field
        sensitiveData = "Malicious Data";

        System.out.println(performSensitiveOperation());

        // Mutation Operator: Dead Store
        // Adding a dead store variable
        String deadStoreVariable = generateRandomString(8);
    }

    // Method to generate a random string of given length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rand.nextInt(characters.length())));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        showBug();
    }
}