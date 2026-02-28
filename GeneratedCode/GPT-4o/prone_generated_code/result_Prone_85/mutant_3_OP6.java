class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());

        // Unreachable for loop mutation
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
    }
    
    // Method to provide a condition for the unreachable for loop
    public static boolean getConditionFor() {
        return false; // The method returns false, making the for loop unreachable
    }
}