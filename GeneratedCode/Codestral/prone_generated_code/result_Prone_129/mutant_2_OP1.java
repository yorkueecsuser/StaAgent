// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;
    // Dead Store mutation: Adding an unused int variable
    private int unusedVariable;

    public BadPackageInfoExample(String message) {
        this.message = message;
        // The added variable is not used here
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}