// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String message;

    public BadPackageInfoExample(String message) {
        this.message = message;
        // Added mutant
        int value = getValue();
        switch (value) {
            case 1:
                // This code will never be executed because getValue() always returns 0
                System.out.println("This is an unreachable switch case");
                break;
        }
    }

    public String getMessage() {
        return message;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file

    // Method for the switch condition
    private int getValue() {
        return 0;
    }
}