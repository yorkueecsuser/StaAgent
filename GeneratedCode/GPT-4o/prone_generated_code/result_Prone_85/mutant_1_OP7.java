class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        // Unreachable while loop: dynamically determine condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This block is unreachable due to the condition.");
        }
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }
    
    // Method to simulate a runtime condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());
    }
}