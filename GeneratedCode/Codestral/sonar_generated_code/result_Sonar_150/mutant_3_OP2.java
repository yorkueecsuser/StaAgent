class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value; // Original assignment statement
        this.value = value; // Duplicated assignment statement
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj;
        this.value = that.value; // Duplicated assignment statement
        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj);
    }
}