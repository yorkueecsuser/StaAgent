class MyClass {
    private String value;
    private boolean unreachableCondition = false;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (unreachableCondition) {  // Unreachable if-else statement
            return true;  // This block will never execute
        } else {
            MyClass that = (MyClass) obj;
            return this.value.equals(that.value);
        }
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }

    private boolean getCondition() {  // Method to return the unreachable condition
        return unreachableCondition;
    }
}