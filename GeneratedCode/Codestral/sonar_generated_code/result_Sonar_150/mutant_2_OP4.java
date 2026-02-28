class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) { // Check if obj is an instance of MyClass
            MyClass that = (MyClass) obj;
            return this.value.equals(that.value);
        }
        return false;
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will not throw a ClassCastException as we are checking the instance type

        // Adding unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code will never be executed as getUnreachableCondition() always returns false
            System.out.println("This line is unreachable");
        } else {
            // This is the else part of the unreachable if-else statement
            // This code will always be executed
            System.out.println("This line is always executed");
        }
    }

    public boolean getUnreachableCondition() {
        // This method always returns false to make the if condition unreachable
        return false;
    }
}