// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable mutant code
            System.out.println("This is an unreachable mutant code");
        }
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file

    // Mutant method to return false condition for if statement
    private boolean getUnreachableCondition() {
        return false;
    }
}