class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
        // Mutation: Duplicating the initialization of an unwritten field (though it remains unwritten)
        int unusedField = 0;
        int unusedField = 0; // Duplicate assignment statement
    }
}