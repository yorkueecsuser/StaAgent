class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { if (true && true && false && false && false && false && true && false && true && true && false) {short bamppjxt = -4071;}else{char xbxbqdet = 'o';}
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