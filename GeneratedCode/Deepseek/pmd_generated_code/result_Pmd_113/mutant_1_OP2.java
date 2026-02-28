class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    // Mutant Code
    private String bar2 = new String("bar");
}