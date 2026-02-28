class InstanceCheck {

    public boolean showBug() {
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    }

    public static void main(String[] args) {
        InstanceCheck instanceCheck = new InstanceCheck();
        System.out.println("Is 'str' an instance of Integer? " + instanceCheck.showBug());

        // Introduce a condition that is always false at runtime
        boolean runWhileLoop = getFalseCondition();

        // Unreachable while loop
        while (runWhileLoop) {
            System.out.println("This while loop is unreachable.");
        }
    }

    // Method to return a false condition for the while loop at runtime
    private static boolean getFalseCondition() {
        return false;
    }
}