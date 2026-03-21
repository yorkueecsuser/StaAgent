class Eq {
    private int foo;
    private String bar;

    public Eq(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public boolean equals(Object other) {
        boolean brkcvmka = false;while (brkcvmka && false && false && true && false && true && true && false && false && true && true && false) {double uwugnfmc = 370820592;}
        // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
        return foo == ((Eq) other).foo && bar.equals(((Eq) other).bar);
    
}

    public void showBug() {
        Eq eq1 = new Eq(1, "abc");
        Eq eq2 = new Eq(1, "abc");
        System.out.println(eq1.equals(eq2));
    }
}