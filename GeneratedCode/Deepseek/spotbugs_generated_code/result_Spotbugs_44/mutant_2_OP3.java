class UnwrittenFieldBug {
    private String unwrittenField;

    private boolean isUnreachable() {
        return false;
    }

    public void showBug() {
        if (isUnreachable()) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }

        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}