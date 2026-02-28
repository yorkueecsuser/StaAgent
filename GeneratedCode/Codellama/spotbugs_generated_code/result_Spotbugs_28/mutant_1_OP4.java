class Eq {
    private int foo;
    private String bar;

    public Eq(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    // Mutant: Unreachable if-else statement
    public boolean equals(Object other) {
        if (false) {
            return foo == ((Eq) other).foo && bar.equals(((Eq) other).bar);
        } else {
            return false;
        }
    }

    public void showBug() {
        Eq eq1 = new Eq(1, "abc");
        Eq eq2 = new Eq(1, "abc");
        System.out.println(eq1.equals(eq2));
    }
}