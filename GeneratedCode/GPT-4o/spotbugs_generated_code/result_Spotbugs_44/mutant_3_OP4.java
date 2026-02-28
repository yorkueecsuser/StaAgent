class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean condition = getCondition(); // Ensure the condition is non-final
        if (condition) {
            // This block is logically unreachable but not a compile-time error
            System.out.println("This will never execute.");
        } else {
            // Original code with the bug
            System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        }
    }

    // Method to determine condition dynamically
    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}