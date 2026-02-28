// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;

        // Inserting unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never be executed
        }
    }

    // Method to get condition for the loop
    private boolean getCondition() {
        return false;
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}