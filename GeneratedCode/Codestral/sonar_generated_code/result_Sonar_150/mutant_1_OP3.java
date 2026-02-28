class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof MyClass)) { // added safety check
            return false;
        }

        MyClass that = (MyClass) obj;
        boolean condition = getCondition(); // using a non-final variable for the condition

        if (condition) { // unreachable if statement
            System.out.println("This line is unreachable.");
        }

        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will now return false without throwing a ClassCastException
    }

    private boolean getCondition() {
        return false; // this method ensures the condition is always false, making the if statement unreachable
    }
}