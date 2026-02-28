class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
        this.value = value; // Mutant: Duplicate the assignment statement
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            MyClass that = (MyClass) obj;
            return this.value.equals(that.value);
        }
        return false;
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will return false instead of throwing a ClassCastException
    }
}