class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        boolean conditionWhile = false; // Condition for the unreachable while loop
        while (conditionWhile) { // Unreachable while loop
            System.out.println("Unreachable code");
        }
        String result = unwrittenField.toLowerCase(); // Original bug: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}