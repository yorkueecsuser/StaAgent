class PreconditionsExample {

    public String showBug(int value) {
        // This line contains the bug as it uses %d instead of %s
        int x = value; // Renamed variable for mutation
        if (x < 0) {
            throw new IllegalArgumentException(String.format("Value must be non-negative: %d", x)); // BUG: PreconditionsInvalidPlaceholder
        }
        return "Valid value";
    }

    public static void main(String[] args) {
        PreconditionsExample example = new PreconditionsExample();
        try {
            example.showBug(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}