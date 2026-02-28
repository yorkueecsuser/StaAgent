import java.util.ArrayList;

class SelfAssignment {
    private int foo;

    public void setFoo(int foo) {
        boolean condition = getCondition();
        if (condition) {
            foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        }
    }

    public int getFoo() {
        return foo;
    }

    public void showBug(int foo) {
        boolean condition = getCondition();
        if (condition) {
            setFoo(foo);
            System.out.println(getFoo());
        }
    }
}