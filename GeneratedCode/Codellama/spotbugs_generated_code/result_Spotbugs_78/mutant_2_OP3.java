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

    //Added code
    public void unreachableIfStatement(int foo) {
        boolean condition = getCondition();
        if (condition) {
            // Code that is never executed
            System.out.println("This code is unreachable");
        } else {
            // Code that always executes
            System.out.println("This code is reachable");
        }
    }
}