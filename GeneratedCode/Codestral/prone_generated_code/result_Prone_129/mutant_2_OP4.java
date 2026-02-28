// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;

        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // This branch is unreachable as per the mutation operator information
            System.out.println("This line will never be executed.");
        } else {
            System.out.println("This is the reachable branch.");
        }
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file

    private boolean getCondition() {
        return false; // This method returns false to ensure the 'if' condition is always unreachable
    }
}