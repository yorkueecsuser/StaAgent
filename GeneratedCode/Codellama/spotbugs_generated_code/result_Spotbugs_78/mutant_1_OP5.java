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

    public void unreachableSwitchStatement() {
        int value = 0;
        switch (value) {
            case 0: // This switch statement is unreachable since the value is 0 and there is no case 0.
                System.out.println("This statement is unreachable.");
                break;
            default:
                break;
        }
    }
}