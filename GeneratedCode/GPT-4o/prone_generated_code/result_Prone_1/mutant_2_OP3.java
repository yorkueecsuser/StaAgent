class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Unreachable if statement mutation
        if (isConditionFalse()) {
            System.out.println("This block is unreachable because the condition is always false.");
        }
        
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    // Method to provide a runtime condition that is always false
    private boolean isConditionFalse() {
        return false;
    }
}