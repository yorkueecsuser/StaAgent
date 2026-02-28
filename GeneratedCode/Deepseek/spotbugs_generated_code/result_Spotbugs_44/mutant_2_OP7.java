class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        // Added mutant: unreachable while loop
        boolean shouldRun = getCondition();
        while (shouldRun) {
            // This block is unreachable because getCondition() always returns false
        }

        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}