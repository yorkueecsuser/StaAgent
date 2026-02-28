// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;

        // Mutant Code: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // This code is unreachable but added to satisfy the requirement
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
    }

    public String getMessage() {
        return message;
    }

    // Additional methods to satisfy the condition and value for the unreachable switch statement
    private boolean getCondition() {
        return false; // This condition ensures the switch statement is unreachable
    }

    private int getValue() {
        return 1; // This value is never reached in the switch statement
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}