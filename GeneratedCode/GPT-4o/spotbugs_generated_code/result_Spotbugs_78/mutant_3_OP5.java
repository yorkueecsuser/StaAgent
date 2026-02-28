class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Mutation: Unreachable switch statement
        int unreachableSwitchCondition = calculateCondition(); // dynamically determined at runtime
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }
    }

    private int calculateCondition() {
        return 0; // Always returns 0, making switch statement effectively unreachable
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