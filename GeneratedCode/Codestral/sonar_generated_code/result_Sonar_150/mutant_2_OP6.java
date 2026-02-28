class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // Mutant: Unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code will never execute.");
        }

        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value.equals(that.value);
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will throw a ClassCastException
    }
}