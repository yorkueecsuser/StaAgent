class UnwrittenFieldBug {
    private String unwrittenField;

    public boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);

        // MUTANT: Unreachable switch statement
        int value = 0; // This value will never make the switch statement reachable
        if (getFalseCondition()) {
            switch (value) {
                case 1:
                    System.out.println("This line is unreachable.");
                    break;
                default:
                    System.out.println("Default case, this line is unreachable.");
            }
        }
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}