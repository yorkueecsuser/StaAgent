class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    private int exampleField = 10; // An additional field to demonstrate duplication

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    public int duplicateAssignment() {
        exampleField = 20; // Original assignment statement
        exampleField = 20; // Duplicated assignment statement
        return exampleField;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
        System.out.println("Duplicated Field Value: " + demo.duplicateAssignment());
    }
}