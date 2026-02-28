class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        
        // Inserted unreachable for loop
        boolean conditionFor = getCondition(); // Using a method to ensure it's not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            // This block will not execute due to the condition being false
        }
        
        return false;
    }
    
    private boolean getCondition() {
        return false; // Ensure this method is used to dynamically determine the condition
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}