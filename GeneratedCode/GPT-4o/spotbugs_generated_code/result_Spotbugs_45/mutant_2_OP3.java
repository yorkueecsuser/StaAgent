class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        boolean condition = getCondition(); // Use a method to avoid compile-time constant
        if (condition) {
            System.out.println("This block is unreachable");
        }
        return alwaysNull;
    }

    private boolean getCondition() {
        return false; // This makes the if block in showBug method unreachable
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}