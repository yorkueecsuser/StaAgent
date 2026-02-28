class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Some unreachable code
            foo = 0;
        } else {
            // Some unreachable code
            foo = 1;
        }
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
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
        // This method returns a condition that is dynamically determined at runtime
        return false; // This is safe as it's not a compile-time constant in the context of the if-else statement
    }
}