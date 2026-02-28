class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            MyClass that = (MyClass) obj;
            return this.value.equals(that.value);
        } else {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This block is unreachable.
                // For demonstration purposes, I'm throwing an exception here, but in a real scenario, this block would be empty.
                throw new RuntimeException("Unreachable code executed.");
            }
            return false;
        }
    }

    private boolean getUnreachableCondition() {
        // This method returns a false value to make sure the if statement is unreachable.
        return false;
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}