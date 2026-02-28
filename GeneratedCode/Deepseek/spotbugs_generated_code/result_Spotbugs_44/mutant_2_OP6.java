class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        // Mutant code: Unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            // This loop is unreachable
            System.out.println("This line will never be executed");
        }

        String result = unwrittenField.toLowerCase(); // Original bug: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}