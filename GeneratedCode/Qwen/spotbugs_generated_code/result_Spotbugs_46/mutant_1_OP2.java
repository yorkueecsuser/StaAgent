class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
        
        // Mutated code: Duplicating the initialization of an unwritten field
        int tempField = 0; // This is a temporary field to demonstrate duplication
        tempField = 10;    // Original assignment
        tempField = 10;    // Duplicated assignment
    }
}