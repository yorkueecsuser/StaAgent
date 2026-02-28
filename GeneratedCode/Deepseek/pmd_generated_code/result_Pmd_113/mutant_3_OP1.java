class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private String deadstore1234 = new String("1234"); // Mutant: Dead Store

    public void showBug() {
        System.out.println(bar);
    }
}