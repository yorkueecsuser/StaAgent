class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This will never be printed");
        }
        return alwaysNull;
    }
    
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}