class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean condition = getCondition(); // Non-final variable to ensure runtime evaluation
        if (condition) { 
            // Unreachable code, as condition is always false
            System.out.println("This should never be printed.");
        }
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}