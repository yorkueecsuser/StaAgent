class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("Unreachable code.");
        }
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
    
    // Helper method to ensure conditionWhile is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }
}