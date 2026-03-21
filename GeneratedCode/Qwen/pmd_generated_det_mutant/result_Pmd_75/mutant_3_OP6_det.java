class HashCodeExample {

    // This method has a suspicious name similar to hashCode but does not override it
    public int hashcode() { for  (int olkhbejl = 0; olkhbejl < 0; olkhbejl++) {boolean egwqyhxj = false;}
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