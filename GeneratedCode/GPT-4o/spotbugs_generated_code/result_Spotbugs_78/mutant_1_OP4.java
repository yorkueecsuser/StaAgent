class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Mutation: Unreachable if-else statement
        boolean shouldExecute = getFalseCondition();
        if (shouldExecute) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("This is the always executed part of the unreachable if-else statement.");
        }
    }

    public int showBug(int value) {
        setFoo(value);
        return this.foo;
    }

    // Method to obtain a runtime false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfAssignmentBugExample example = new SelfAssignmentBugExample();
        int result = example.showBug(10);
        System.out.println("The value of foo is: " + result);
    }
}