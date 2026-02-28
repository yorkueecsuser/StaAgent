class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        int value = getValue();

        // Mutant: Unreachable switch statement
        switch (value) {
            case 1:
                System.out.println("This code will never be executed");
                break;
        }

        String result = unwrittenField.toLowerCase(); // Original bug: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    private int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}