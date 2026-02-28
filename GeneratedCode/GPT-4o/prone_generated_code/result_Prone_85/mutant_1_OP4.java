class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
        
        // Unreachable if-else branch
        boolean condition = determineCondition(); // A non-final variable or method
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the always executed branch.");
        }
    }
    
    // Method to produce a runtime condition
    public static boolean determineCondition() {
        return false;
    }
}