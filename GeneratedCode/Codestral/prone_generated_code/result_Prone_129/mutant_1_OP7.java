// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;

        // Mutation: Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line is unreachable due to the mutation.");
        }
    }

    public String getMessage() {
        return message;
    }

    // Method to return the condition for the while loop (always returns false)
    private boolean getCondition() {
        return false;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}