// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String m; // mutant code: renamed'message' to'm'

    public BadPackageInfoExample(String message) {
        this.m = message; // mutant code: updated to'm'
    }

    public String getMessage() {
        return m; // mutant code: updated to'm'
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}