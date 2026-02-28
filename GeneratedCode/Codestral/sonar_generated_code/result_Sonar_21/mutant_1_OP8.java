class MethodExceptionBug {
    private int value;
    private int z; // Mutant: Renaming 'value' to 'z'

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
        this.z = value; // Mutant: Adding assignment to the renamed variable 'z'
    }

    public void showBug() {
        setValue(-5);
        // Mutant: Adding separate call to setValue with the renamed variable 'z'
        setZ(-5);
    }

    // Mutant: Adding a new method to set the renamed variable 'z'
    public void setZ(int z) {
        if (z < 0) {
            throw new IllegalArgumentException("Z must be non-negative");
        }
        this.z = z;
    }
}