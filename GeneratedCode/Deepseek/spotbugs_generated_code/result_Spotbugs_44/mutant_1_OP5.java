class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        int value = getValue();
        switch (value) {
            case 1:
                // This case is unreachable since getValue() always returns 0
                break;
        }

        String result = unwrittenField.toLowerCase(); // Original bug is maintained
        System.out.println(result);
    }

    private int getValue() {
        return 0; // Always returns 0 to make the switch statement unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}