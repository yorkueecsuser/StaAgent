class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj;
        while (getFalseCondition()) { // Mutant: Unreachable while loop
            // This code will never be executed
        }
        return this.value.equals(that.value);
    }

    private boolean getFalseCondition() {
        return false; // Always returns false
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}