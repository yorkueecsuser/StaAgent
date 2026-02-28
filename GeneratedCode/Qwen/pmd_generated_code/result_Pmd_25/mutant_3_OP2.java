class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
        this.value = value; // Mutation: Duplicate assignment statement
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.value = value; // Mutation: Duplicate assignment statement
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}