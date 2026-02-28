class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        boolean condition = false;
        for(int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This line should never be executed");
        }
        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}