class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private String foo = new String("foo"); // MUTANT: Renaming

    public void showBug() {
        System.out.println(bar);
    }
}