class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        int xiqpuzlx = 0;switch  (xiqpuzlx) {case 1:boolean gdfrkxyc = true;break;default:double ifhhsylg = -560198984;break;}
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