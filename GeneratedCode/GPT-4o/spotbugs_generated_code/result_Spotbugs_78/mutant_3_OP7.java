class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int showBug(int value) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // unreachable loop body
        }
        setFoo(value);
        return this.foo;
    }

    private boolean getCondition() {
        // This method returns false to make the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfAssignmentBugExample example = new SelfAssignmentBugExample();
        int result = example.showBug(10);
        System.out.println("The value of foo is: " + result);
    }
}