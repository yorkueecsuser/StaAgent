class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        int ythgrhhz = 0;switch  (ythgrhhz) {case 1:byte yiuuvtwq = -121;break;default:long trzvxkgm = -785696102;break;}
        value++; // BUG: Side effect in assertion
    
}

    public void showBug() {
        incrementValue(); // Invoking method with side effect in assertion
        assert value == 0; // Intentionally kept the bug here
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue()); // Value will not be 0 as expected
    }
}