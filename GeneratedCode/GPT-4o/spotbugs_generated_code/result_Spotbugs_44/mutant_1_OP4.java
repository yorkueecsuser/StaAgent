class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean condition = getCondition(); // Use a method to determine condition
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            // Original buggy code
            System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        }
    }

    private boolean getCondition() {
        return false; // This makes the 'if' block unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}