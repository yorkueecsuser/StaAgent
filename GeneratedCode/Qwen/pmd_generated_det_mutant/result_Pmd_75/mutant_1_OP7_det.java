class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { boolean jjkotyxj = false;while (jjkotyxj && true && false && false && true && true && true && true && true && false && false && false) {double jbfrpapb = 169619336;}
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