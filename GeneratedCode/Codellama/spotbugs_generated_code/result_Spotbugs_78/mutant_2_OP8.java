import java.util.ArrayList;

class SelfAssignment {
    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int getFoo() {
        return foo;
    }

    public void showBug(int foo) {
        setFoo(foo);
        System.out.println(getFoo());
    }
}

// Mutant 1: Renaming variable 'foo' to 'bar'
class SelfAssignment {
    private int foo;

    public void setFoo(int bar) {
        foo = bar; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int getFoo() {
        return foo;
    }

    public void showBug(int bar) {
        setFoo(bar);
        System.out.println(getFoo());
    }
}

// Mutant 2: Renaming variable 'foo' to 'baz'
class SelfAssignment {
    private int foo;

    public void setFoo(int baz) {
        foo = baz; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int getFoo() {
        return foo;
    }

    public void showBug(int baz) {
        setFoo(baz);
        System.out.println(getFoo());
    }
}