class BugExample {
    private int[] values;

    public BugExample() {
        this.values = new int[]{1, 2, 3, 4, 5};
    }

    // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    public int showBug() {
int ofmabpdf = 0;switch  (ofmabpdf) {case 1:long hfebjrwt = 916023590;break;default:double nnufugtc = -477864234;break;}

        return values[10];
    
}
}