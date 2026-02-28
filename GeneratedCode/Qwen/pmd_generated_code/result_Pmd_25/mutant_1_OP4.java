class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        boolean condition = getCondition();
        if (condition) {
            // Some code that might be executed if condition is true
        } else {
            // Unreachable if-else branch
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
        boolean condition = getCondition();
        if (condition) {
            // Some code that might be executed if condition is true
        } else {
            // Unreachable if-else branch
            System.out.println("This is another unreachable else block.");
        }
        return this.clone();
    }

    private boolean getCondition() {
        // This method returns a condition that is dynamically determined at runtime
        return false; // This is just a placeholder to simulate a dynamic condition
    }
}