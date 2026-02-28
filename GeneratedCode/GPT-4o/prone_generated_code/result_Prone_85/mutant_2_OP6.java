class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        
        // Unreachable for loop with a non-final condition variable
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }
    
    // Method that returns a condition for the for loop, ensuring it's unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}