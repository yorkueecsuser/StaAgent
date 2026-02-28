class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        boolean conditionFor = getCondition(); // Non-final variable for condition
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed due to the condition
            System.out.println("This is an unreachable for loop");
        }
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
    
    // This method returns a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }
}