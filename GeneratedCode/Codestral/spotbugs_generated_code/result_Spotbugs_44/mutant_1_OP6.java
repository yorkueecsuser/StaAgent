class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        // Adding unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This code will never be executed");
        }

        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}