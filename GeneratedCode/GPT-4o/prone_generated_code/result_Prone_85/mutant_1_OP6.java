class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        
        // Unreachable for loop inserted as per mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for-loop is unreachable.");
        }
        
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }
    
    // Method to simulate a condition, making the for-loop condition unreachable
    public boolean getCondition() {
        return false; // This method call results in a false condition at runtime, making the for-loop unreachable
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}