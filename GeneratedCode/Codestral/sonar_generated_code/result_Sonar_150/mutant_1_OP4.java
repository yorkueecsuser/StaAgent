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
        } else {
            // Mutant code: Unreachable if-else statement
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                // This code is unreachable
                System.out.println("Unreachable code executed");
            } else {
                // This is the else branch of the unreachable if-else statement
                return false;
            }
        }
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will return false and avoid a ClassCastException
    }
}