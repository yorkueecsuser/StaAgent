class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop will never be entered
        }

        MyClass that = (MyClass) obj;
        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}