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
        }
        return false;
    }

    public void showBug() {
        String deadStore = "Unused variable"; // Dead Store mutation
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj);
    }
}