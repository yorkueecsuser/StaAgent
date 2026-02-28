class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // Original bug
        System.out.println(result);

        // Duplication Mutant
        String duplicateResult = unwrittenField.toLowerCase(); // Duplicate the bug
        System.out.println(duplicateResult);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}