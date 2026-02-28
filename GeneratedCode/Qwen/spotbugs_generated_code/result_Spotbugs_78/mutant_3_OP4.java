class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        } else {
            // Unreachable if-else branch
            foo = 42; // This line is logically unreachable due to the condition
        }
    }

    public int showBug(int inputValue) {
        setFoo(inputValue);
        return foo;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println("Expected to set foo to 10, but got: " + bugDemo.showBug(10));
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else block unreachable
    }
}