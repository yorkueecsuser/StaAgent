class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        return hashcode();
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}

// Mutant code with variable renaming
class HashcodeExampleMutant {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() {
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        return hashcode();
    }

    public static void main(String[] args) {
        HashcodeExampleMutant a = new HashcodeExampleMutant();
        System.out.println("Result of hashcode method: " + a.showBug());
    }
}