class UnwrittenFieldBug {
    private String unwrittenField;
    private String renamedField;

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // Original bug
        if (renamedField!= null) { // Newly added code
            String renamedResult = renamedField.toLowerCase(); // Mutated code with renamed variable
            System.out.println(renamedResult);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}