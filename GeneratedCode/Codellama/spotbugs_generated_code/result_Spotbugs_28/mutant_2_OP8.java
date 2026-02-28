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
}

// Mutation Operator: Renaming
// Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].

// Generated mutated Java code:

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
}

// Mutated variable: foo
// Original value: 1
// Mutated value: abc