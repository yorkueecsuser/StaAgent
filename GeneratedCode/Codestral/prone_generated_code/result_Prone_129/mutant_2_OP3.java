// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
        // Mutation: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("This code should never be executed.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}