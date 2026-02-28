class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    public void mutantUnreachableWhileLoop() {
        boolean conditionWhile = true;
        while (conditionWhile) {
            conditionWhile = false;
        }
    }
}