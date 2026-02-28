class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            String result = unwrittenField.toLowerCase(); // Original bug: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
            System.out.println(result);
        } else {
            System.out.println("This line should never be executed because the condition is always false.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else branch unreachable.
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}