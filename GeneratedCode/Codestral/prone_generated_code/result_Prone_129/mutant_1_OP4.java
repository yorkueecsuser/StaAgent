// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // Unreachable if-else statement
            System.out.println("This code should never be executed.");
        } else {
            System.out.println("This code is also unreachable.");
        }
    }

    public String getMessage() {
        return message;
    }

    private boolean getCondition() {
        return false;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}