class EqAlwaysFalseExample {

    private int value;

    public EqAlwaysFalseExample(int value) {
        this.value = value;
        this.value = value; // Mutation: Duplicated assignment statement
    }

    @Override
    public boolean equals(Object o) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
        return false; // Mutation: Duplicated return statement (though it's unreachable, it adheres to the mutation operator)
    }

    public int showBug(EqAlwaysFalseExample other) {
        return this.equals(other)? 1 : 0;
        return this.equals(other)? 1 : 0; // Mutation: Duplicated return statement (though it's unreachable, it adheres to the mutation operator)
    }

    public static void main(String[] args) {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        EqAlwaysFalseExample obj2 = new EqAlwaysFalseExample(10);
        System.out.println("obj1.equals(obj1): " + obj1.showBug(obj1)); // Should print 0
        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Should print 0
        System.out.println("obj1.equals(obj1): " + obj1.showBug(obj1)); // Mutation: Duplicated print statement
        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Mutation: Duplicated print statement
    }
}