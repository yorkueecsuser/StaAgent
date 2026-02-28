// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable if statement");
        }
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
    // Mutation Operator: Unreachable if statement
    // Mutant code added to maintain the original code and to follow the mutation operator's description
}