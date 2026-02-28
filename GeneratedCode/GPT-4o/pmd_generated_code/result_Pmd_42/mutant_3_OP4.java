class EqualsNullExample {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String input) {
        // Unreachable if-else branch injected
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable if-else branch.");
        } else {
            System.out.println("This else block is also unreachable.");
        }
        
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}