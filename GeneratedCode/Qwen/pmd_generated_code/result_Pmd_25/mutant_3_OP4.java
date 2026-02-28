class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in clone method.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code in clone method.");
        }
        return super.clone();
    }

    public int getValue() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in getValue method.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code in getValue method.");
        }
        return value;
    }

    public void setValue(int value) {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in setValue method.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code in setValue method.");
        }
        this.value = value;
    }

    public Object showBug() throws CloneNotSupportedException {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug method.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code in showBug method.");
        }
        return this.clone();
    }

    private boolean getCondition() {
        // This method should return a condition that is dynamically determined at runtime
        return false; // This is just a placeholder to simulate a dynamic condition
    }
}