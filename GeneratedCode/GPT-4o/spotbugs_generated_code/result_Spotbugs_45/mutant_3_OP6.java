class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

        // Introduce an unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable.");
        }
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }

    // Method to simulate a false condition for the unreachable loop
    private boolean getFalseCondition() {
        return false;
    }
}