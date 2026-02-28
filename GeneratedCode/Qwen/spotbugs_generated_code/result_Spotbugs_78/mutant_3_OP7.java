class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop is unreachable because getCondition() will never return true
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
        return false; // This method ensures the condition is always false, making the while loop unreachable
    }
}