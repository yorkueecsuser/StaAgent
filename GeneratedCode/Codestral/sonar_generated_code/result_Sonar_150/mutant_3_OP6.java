class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) { // Safe type checking
            MyClass that = (MyClass) obj;
            boolean unreachableCondition = false; // Replace with a dynamic condition if necessary
            for (int i = 0; unreachableCondition; i++) {
                // This code will never be executed
            }
            return this.value.equals(that.value);
        } else {
            return false;
        }
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}