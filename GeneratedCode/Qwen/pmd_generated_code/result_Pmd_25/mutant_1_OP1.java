class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
        // Dead Store Mutation
        String abcdefgh = "unusedVariable";
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
        // Dead Store Mutation
        int hijklmno = 42;
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
        // Dead Store Mutation
        boolean pqrstuvw = true;
    }
}