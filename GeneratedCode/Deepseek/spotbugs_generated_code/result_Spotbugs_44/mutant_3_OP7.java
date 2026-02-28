class UnwrittenFieldBug {
    private String unwrittenField;

    private boolean getCondition() { // Method to get the condition for the unreachable while loop
        return false;
    }

    public void showBug() {
        while (getCondition()) { // Unreachable while loop
            System.out.println("This statement is unreachable");
        }

        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}