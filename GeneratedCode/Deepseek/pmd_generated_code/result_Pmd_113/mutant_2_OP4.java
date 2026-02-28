class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation
    private boolean unreachableCondition = false;

    public void showBug() {
        System.out.println(bar);
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This line is unreachable");
        }
    }
}