class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        boolean conditionWhile = getCondition(); // Dynamically determine the condition
        while (conditionWhile) {
            // This block will never be executed because the condition is set to false
            System.out.println("This while loop is unreachable.");
        }

        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }

    private boolean getCondition() {
        return false; // The condition for the while loop, ensuring it is unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}