class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Adding unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed.");
        }
        
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    // Method to simulate a false condition
    private boolean getCondition() {
        return false;
    }
}