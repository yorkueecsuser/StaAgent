class UnwrittenFieldBug {
    private String unwrittenField;
    private String renamedField; // Mutant: Renaming the variable

    public void showBug() {
        String result = unwrittenField.toLowerCase(); // Bug: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
        if(renamedField!= null) { // Added to avoid NullPointerException while using renamedField
            System.out.println(renamedField.toLowerCase());
        }
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}