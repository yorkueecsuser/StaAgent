// package-info.java

/**
 * This is an example of a class declared inside a package-info.java file.
 * This is a bad practice as per the Java Language Specification.
 */
class BadPackageInfoExample {
    private String newMessage;  // Mutated: Renamed'message' to 'newMessage'

    public BadPackageInfoExample(String newMessage) {  // Mutated: Renamed'message' to 'newMessage'
        this.newMessage = newMessage;
    }

    public String getNewMessage() {  // Mutated: Renamed 'getMessage' to 'getNewMessage'
        return newMessage;
    }

    // BUG: PackageInfo - This class declaration is inside a package-info.java file
}