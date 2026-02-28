class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean condition = getCondition(); // Using a method to determine the condition
        if (condition) {
            System.out.println("This block will never execute.");
        }

        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the if block unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}