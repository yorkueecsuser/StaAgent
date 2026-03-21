class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { if (true && false && true && true && true && true && true && false && true && false && false) {float ltbbmnxn = -270131248;}
 // BUG: SuspiciousHashcodeMethodName
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