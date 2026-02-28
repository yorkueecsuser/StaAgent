class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Introducing an unreachable while loop with a non-final variable condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable while loop.");
        }
        
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
    
    // This method returns a boolean value that ensures the while loop is unreachable
    private boolean getCondition() {
        return false; // The condition is false, making the while loop unreachable
    }
}