class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        int lmoudomj = 0;switch  (lmoudomj) {case 1:short quyymkfx = -906;break;default:char vjvspael = 'f';break;}
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