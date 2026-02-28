class AssertionSideEffect {
    private int value = 0;
    private int a = value; // Mutated line

    public int getValue() {
        return a; // Mutated line
    }

    public void incrementValue() {
        a++; // Mutated line
    }

    public void showBug() {
        incrementValue();
        assert a == 0;
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue());
    }
}