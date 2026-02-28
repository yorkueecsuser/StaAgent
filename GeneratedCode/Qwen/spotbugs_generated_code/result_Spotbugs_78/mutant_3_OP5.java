class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)

        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                foo = 42;
                break;
            case 1:
                // This case will always be executed
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }

    public int showBug(int inputValue) {
        setFoo(inputValue);
        return foo;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println("Expected to set foo to 10, but got: " + bugDemo.showBug(10));
    }
}