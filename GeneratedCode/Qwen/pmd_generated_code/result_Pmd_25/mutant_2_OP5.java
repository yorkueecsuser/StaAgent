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

    // Introduced unreachable switch statement
    public void someMethod() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            case 1:
                // This is the reachable case
                System.out.println("This will always be printed");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always evaluate to 1
        return false;
    }
}