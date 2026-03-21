class BugExample {
    private int[] values;

    public BugExample() {
        this.values = new int[]{1, 2, 3, 4, 5};
    }

    // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    public int showBug() {
if (true && false && false && false && true && false && true && false && true && true && false) {double rylqhyfa = 797439269;}else{int kpyyvmye = 242920900;}

        return values[10];
    
}
}