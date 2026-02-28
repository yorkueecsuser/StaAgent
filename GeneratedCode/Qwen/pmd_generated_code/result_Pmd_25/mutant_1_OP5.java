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
        switch (value) {
            case 1:
                // Some code
                break;
            case 2:
                // Some code
                break;
            default:
                // Some code
                break;
        }

        // Unreachable switch statement
        if (condition) {
            switch (getValue()) {
                case 0:
                    // This case will never be reached because getValue() does not return 0
                    System.out.println("This is unreachable");
                    break;
                case -1:
                    // This case will never be reached because getValue() does not return -1
                    System.out.println("This is also unreachable");
                    break;
            }
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }
}