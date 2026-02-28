// package-info.java

import java.util.Random;

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;
    private String unusedVariable; // Dead Store: Unused variable declaration

    public BadPackageInfoExample(String message) {
        this.message = message;
        this.unusedVariable = generateRandomString(8); // Initialize the unused variable
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file

    // Method to generate a random string of specified length
    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }
}