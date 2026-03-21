class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { if (true && false && true && true && false && false && false && false && false && false && false) {float tprgtghy = -744285615;}else{double shqivozz = -288727579;}
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