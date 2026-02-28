class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        }

        MyClass that = (MyClass) obj;
        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}