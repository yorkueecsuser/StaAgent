class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }
}