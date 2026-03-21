class AssertionSideEffect {
    private int v = 0;  // 'value' renamed to 'v'

    public int getValue() {
        return v;
    }

    public void incrementValue() {
        v++;  // BUG: Side effect in assertion
    }

    public void showBug() {
        incrementValue();  // Invoking method with side effect in assertion
        assert v == 0;  // Intentionally kept the bug here
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue());  // Value will not be 0 as expected
    }
}