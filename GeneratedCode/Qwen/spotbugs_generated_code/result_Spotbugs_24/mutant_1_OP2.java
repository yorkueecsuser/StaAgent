class EqAlwaysFalseExample {

    private int value;

    public EqAlwaysFalseExample(int value) {
        this.value = value;
        this.value = value; // Duplicate assignment statement
    }

    @Override
    public boolean equals(Object o) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false; // Duplicate return statement to adhere to mutation operator
    }

    public int showBug(EqAlwaysFalseExample other) {
        return this.equals(other)? 1 : 0;
        return this.equals(other)? 1 : 0; // Duplicate return statement to adhere to mutation operator
    }

    public static void main(String[] args) {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        EqAlwaysFalseExample obj2 = new EqAlwaysFalseExample(10);
        System.out.println("obj1.equals(obj1): " + obj1.showBug(obj1)); // Should print 0
        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Should print 0
    }
}