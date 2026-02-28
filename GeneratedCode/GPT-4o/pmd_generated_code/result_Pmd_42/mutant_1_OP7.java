class EqualsNullExample {

    public boolean showBug(String input) {
        // Unreachable while loop added
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is intentionally unreachable
            System.out.println("This is unreachable code.");
        }
        
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    // Method to simulate dynamic condition which always returns false
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}