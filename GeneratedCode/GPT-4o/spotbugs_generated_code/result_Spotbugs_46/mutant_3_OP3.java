class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        
        // Introducing an unreachable if statement using a non-final variable to ensure it's unreachable
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable code block.");
        }
        
        return unwrittenField;
    }

    // Method to provide a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}