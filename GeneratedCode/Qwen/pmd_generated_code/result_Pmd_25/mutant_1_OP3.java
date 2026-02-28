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
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable because getUnreachableCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
        return this.clone();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}