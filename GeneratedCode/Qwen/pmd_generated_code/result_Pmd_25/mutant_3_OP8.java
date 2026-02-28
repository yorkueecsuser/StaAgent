class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
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
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }

    // Mutant code with Renaming mutation operator
    private int x;

    public MyClass(int x) {
        this.x = x;
    }

    public Object cloneX() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Object showBugX() throws CloneNotSupportedException {
        return this.cloneX();
    }
}