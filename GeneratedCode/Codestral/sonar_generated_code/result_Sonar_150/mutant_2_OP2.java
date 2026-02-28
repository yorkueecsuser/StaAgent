class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
        this.value = value; // Duplication Mutation
        this.value = this.value; // Additional unique mutation
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}