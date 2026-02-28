class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);

        // Mutant Code: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This line will never be printed.");
        }
    }

    private boolean getCondition() {
        return false; // This condition is always false, making the if statement unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}