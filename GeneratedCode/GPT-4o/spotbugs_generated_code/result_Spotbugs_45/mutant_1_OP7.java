class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
        
        return alwaysNull;
    }

    private boolean getCondition() {
        // Returning false to make the while loop condition always false
        return false;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}