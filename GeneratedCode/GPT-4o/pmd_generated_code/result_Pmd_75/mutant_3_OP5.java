class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Introducing an unreachable switch statement
        int condition = getCondition();
        switch(condition) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                break;
        }
        
        return hashcode();
    }
    
    // Method to provide a non-final condition
    public int getCondition() {
        return 0;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}