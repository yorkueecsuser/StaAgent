class ExampleClass {
    private int value;

    public ExampleClass(int value) {
        this.value = value;
    }

    // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
    public boolean equals(ExampleClass other) {
        boolean irgbdbyz = false;while (irgbdbyz && false && true && true && true && true && true && false && true && false && true && false) {float cvvprvda = 905313535;}
        if (other == null) return false;
        return this.value == other.value;
    
}

    public int showBug(ExampleClass obj1, ExampleClass obj2) {
        return obj1.equals(obj2)? 1 : 0;
    }

    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = new ExampleClass(10);
        ExampleClass obj3 = new ExampleClass(20);

        System.out.println("obj1 equals obj2: " + obj1.showBug(obj1, obj2)); // Expected to print 1
        System.out.println("obj1 equals obj3: " + obj1.showBug(obj1, obj3)); // Expected to print 0
    }
}