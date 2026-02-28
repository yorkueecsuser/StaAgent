// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;

        // Inserted unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This should never print");
                    break;
                default:
                    break;
            }
        }
    }

    public String getMessage() {
        return message;
    }

    // Methods to avoid compile-time constant usage for switch statement
    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}