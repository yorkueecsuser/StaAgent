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

    // Mutant code with renaming mutation operator
    private int x; // Renamed 'value' to 'x'

    public MyClass(int x) { // Renamed 'value' to 'x'
        this.x = x;
    }

    public int getX() { // Renamed 'getValue' to 'getX' and 'value' to 'x'
        return x;
    }

    public void setX(int x) { // Renamed'setValue' to'setX' and 'value' to 'x'
        this.x = x;
    }

    public Object displayBug() throws CloneNotSupportedException { // Renamed'showBug' to 'displayBug'
        return this.clone();
    }
}