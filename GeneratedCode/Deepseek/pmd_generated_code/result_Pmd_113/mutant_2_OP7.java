class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    private boolean conditionWhile = false;

    public void showBug() {
        System.out.println(bar);

        while (conditionWhile) {
            // unreachable code
        }
    }
}