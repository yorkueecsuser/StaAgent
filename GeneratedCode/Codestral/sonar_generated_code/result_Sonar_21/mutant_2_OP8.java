class MethodExceptionBug {
    private int value;
    private int v; // Mutant: Renaming user-defined variable

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
        this.v = value; // Mutant: Assigning value to the renamed variable
    }

    public void showBug() {
        setValue(-5);
        System.out.println(v); // Mutant: Using the renamed variable
    }
}