class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        boolean condition = getCondition();
        if (condition) {
            // Some code that should never be executed
            System.out.println("This is an unreachable if block.");
        } else {
            // Some alternative code that should also never be executed
            System.out.println("This is an unreachable else block.");
        }
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

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}