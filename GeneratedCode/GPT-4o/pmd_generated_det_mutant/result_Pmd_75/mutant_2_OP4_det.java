class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { if (false && true && true && false && true && false && false && false && true && true && false) {char owkppwbw = 'b';}else{boolean qkoltcny = true;}
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