class UnwrittenFieldExample {
    private String name; // This field is never written to

    public void showBug() {
        System.out.println("Name: " + name.length()); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method ensures the value does not match any case
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This too will never be printed.");
                break;
            default:
                // No default case action
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // Ensures the switch cases are never matched
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug();
    }
}