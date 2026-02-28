class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private boolean unreachableCondition = false; // non-final variable

    public void showBug() {
        System.out.println(bar);

        // Unreachable if statement
        if (unreachableCondition) {
            System.out.println("This will never be executed");
        }
    }
}