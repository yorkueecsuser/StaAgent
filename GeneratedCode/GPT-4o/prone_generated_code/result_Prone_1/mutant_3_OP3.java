class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Insert an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
        
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
    
    // Helper method to ensure the condition is not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }
}