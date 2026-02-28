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

    // Unreachable if statement mutant
    public void showBugMutant(int foo) {
        boolean condition = getCondition();
        if (condition) {
            setFoo(foo);
            System.out.println(getFoo());
        } else {
            System.out.println("Unreachable code");
        }
    }
}