class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        // Introducing an unreachable if-else statement
        boolean condition = getCondition(); // This method simulates a dynamic condition
        if (condition) {
            System.out.println("This branch is never reachable");
        } else {
            System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        }
    }
    
    // Method to simulate a runtime condition
    private boolean getCondition() {
        return false; // Always returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}