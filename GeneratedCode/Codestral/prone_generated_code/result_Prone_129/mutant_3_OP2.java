// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
        this.message = this.message;  // Mutant code: Duplicating an assignment statement
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}