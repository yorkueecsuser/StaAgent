class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int showBug(int value) {
        setFoo(value);
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print due to an unreachable condition.");
        }
        return this.foo;
    }

    private boolean getCondition() {
        return false; // This ensures the if statement is unreachable
    }

    public static void main(String[] args) {
        SelfAssignmentBugExample example = new SelfAssignmentBugExample();
        int result = example.showBug(10);
        System.out.println("The value of foo is: " + result);
    }
}