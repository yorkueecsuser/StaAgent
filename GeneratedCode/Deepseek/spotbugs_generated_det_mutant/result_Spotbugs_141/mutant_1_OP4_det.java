class BugExample {
    private int[] values;

    public BugExample() {
        this.values = new int[]{1, 2, 3, 4, 5};
    }

    // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    public int showBug() {
if (false && false && true && false && false && true && true && false && false && true && false) {boolean ttncgtwj = true;}else{boolean byogooyi = true;}

        return values[10];
    
}
}