class MethodExceptionBug {
    private int value;
    private int x; // Mutant: New variable added

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        x = value; // Mutant: Variable renamed from 'this.value' to 'x'
    }

    public void showBug() {
        setValue(-5);
    }

    public int getValue() { // Mutant: New method added to retrieve the value of 'x'
        return x;
    }
}