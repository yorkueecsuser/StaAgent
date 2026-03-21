class BugExample {
    private int[] values;

    public BugExample() {
        this.values = new int[]{1, 2, 3, 4, 5};
    }

    // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    public int showBug() {
for  (int vlkcfqmh = 0; vlkcfqmh < 0; vlkcfqmh++) {double itbbqlff = 378819302;}

        return values[10];
    
}
}