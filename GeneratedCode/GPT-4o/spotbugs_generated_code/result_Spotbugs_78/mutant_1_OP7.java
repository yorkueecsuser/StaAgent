class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Adding unreachable while loop mutation
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }
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
    
    private boolean getUnreachableCondition() {
        return false;
    }
}