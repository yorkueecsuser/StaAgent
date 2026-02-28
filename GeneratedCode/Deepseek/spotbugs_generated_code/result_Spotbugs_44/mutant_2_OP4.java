class UnwrittenFieldBug {
    private String unwrittenField;

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        if (getUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("This line should never print.");
        } else {
            String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}