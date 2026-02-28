class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)

        // Inserting unreachable switch statement
        int unreachableCondition = calculateCondition(); // Dynamically determined
        switch (unreachableCondition) {
            case 999: // This case is unreachable as calculateCondition will not return 999
                System.out.println("This is unreachable code.");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private int calculateCondition() {
        // Always returns a value that is not 999 to ensure switch is unreachable
        return 0;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}