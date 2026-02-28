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

/* Unreachable switch statement mutant */
class EqMutant {
    private int foo;
    private String bar;

    public EqMutant(int foo, String bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public boolean equals(Object other) {
        // BUG: Eq: equals() method defined that doesn’t override Object.equals(Object) (EQ_OTHER_USE_OBJECT)
        return foo == ((EqMutant) other).foo && bar.equals(((EqMutant) other).bar);
    }

    public void showBug() {
        EqMutant eq1 = new EqMutant(1, "abc");
        EqMutant eq2 = new EqMutant(1, "abc");
        System.out.println(eq1.equals(eq2));
    }

    public void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                // unreachable code
                System.out.println("Unreachable code");
                break;
            default:
                // default case
                System.out.println("Default case");
                break;
        }
    }
}