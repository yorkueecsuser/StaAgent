class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }
        return this.clone();
    }

    private boolean getCondition() {
        return false;
    }
}