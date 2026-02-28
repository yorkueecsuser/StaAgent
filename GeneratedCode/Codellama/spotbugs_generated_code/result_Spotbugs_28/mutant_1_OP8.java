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

// Mutated code using Renaming mutation operator
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

// Renamed variable "eq1" to "a"
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
        Eq a = new Eq(1, "abc");
        Eq eq2 = new Eq(1, "abc");
        System.out.println(a.equals(eq2));
    }
}

// Renamed variable "eq2" to "b"
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
        Eq a = new Eq(1, "abc");
        Eq b = new Eq(1, "abc");
        System.out.println(a.equals(b));
    }
}