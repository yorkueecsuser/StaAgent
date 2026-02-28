class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Introducing a non-final variable for the condition
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This code is never reached");
        }
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }
}