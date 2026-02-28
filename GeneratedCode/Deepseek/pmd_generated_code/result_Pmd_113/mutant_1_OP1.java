class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private String deadStore = "deadstore"; // dead store mutation

    public void showBug() {
        System.out.println(bar);
    }
}