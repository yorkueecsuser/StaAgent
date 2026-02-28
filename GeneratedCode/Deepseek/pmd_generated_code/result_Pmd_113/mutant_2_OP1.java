class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    // Mutation Operator: Dead Store
    private String deadStore1 = "abcdefgh"; // Unused variable declaration

    public void showBug() {
        System.out.println(bar);
    }

    // Mutation Operator: Dead Store
    private String deadStore2 = "ijklmnop"; // Unused variable declaration
}