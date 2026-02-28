class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Mutated Code: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            foo = 42;
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

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }
}