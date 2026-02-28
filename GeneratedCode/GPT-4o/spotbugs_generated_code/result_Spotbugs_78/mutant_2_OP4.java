class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is always executed as condition is false.");
        }
    }

    private boolean getCondition() {
        return false; // This makes the condition always false, hence the first block is unreachable.
    }

    public int showBug(int value) {
        setFoo(value);
        return this.foo;
    }

    public static void main(String[] args) {
        SelfAssignmentBugExample example = new SelfAssignmentBugExample();
        int result = example.showBug(10);
        System.out.println("The value of foo is: " + result);
    }
}