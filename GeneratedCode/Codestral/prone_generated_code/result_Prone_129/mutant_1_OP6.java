// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
    }

    public String getMessage() {
        // Mutation Operator: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}