class Eq {
    private int foo;
    private String bar;

    public Eq(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public boolean equals(Object other) {
        // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
        return foo == ((Eq) other).foo && bar.equals(((Eq) other).bar);
    }

    public void showBug() {
        Eq eq1 = new Eq(1, "abc");
        Eq eq2 = new Eq(1, "abc");
        System.out.println(eq1.equals(eq2));
    }

    // Mutation Operator: Unreachable for loop
    // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
    // Code:
    public void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // unreachable code
        }
    }
}