// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;
    private int deadStoreMutant; // Dead Store Mutant: Unused variable declaration

    public BadPackageInfoExample(String message) {
        this.message = message;
        this.deadStoreMutant = 0; // Initialize the dead store mutant
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}