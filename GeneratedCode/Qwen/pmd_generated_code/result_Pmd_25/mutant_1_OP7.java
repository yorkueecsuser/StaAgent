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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is intended to be unreachable
            System.out.println("This loop should never execute");
        }
        return this.clone();
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }
}