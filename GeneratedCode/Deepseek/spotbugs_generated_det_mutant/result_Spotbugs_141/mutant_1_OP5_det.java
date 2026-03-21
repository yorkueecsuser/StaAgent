class BugExample {
    private int[] values;

    public BugExample() {
        this.values = new int[]{1, 2, 3, 4, 5};
    }

    // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
    public int showBug() {
int tnyrwcdt = 0;switch  (tnyrwcdt) {case 1:double virwuphp = -47823070;break;default:float xxrobcpy = -235169119;break;}

        return values[10];
    
}
}