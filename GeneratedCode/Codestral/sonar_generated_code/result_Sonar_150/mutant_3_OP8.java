class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            MyClass a = (MyClass) obj;
            return this.value.equals(a.value);
        }
        return false;
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj);
        // This will return false instead of throwing a ClassCastException
    }
}