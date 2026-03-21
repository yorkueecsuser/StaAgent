class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { if (true && false && false && true && false && false && true && false && true && false && false) {short njyegplu = -5533;}else{double jhndhhcq = 616240842;}
 // BUG: SuspiciousHashcodeMethodName
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }

    public static void main(String[] args) {
        HashCodeExample example = new HashCodeExample();
        System.out.println("Suspicious hashcode method result: " + example.showBug());
    }
}