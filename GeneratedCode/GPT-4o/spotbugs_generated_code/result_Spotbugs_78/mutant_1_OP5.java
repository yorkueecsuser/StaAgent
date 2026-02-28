class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                // default case to avoid compile-time errors
                break;
        }
    }

    private int getUnreachableValue() {
        // Returns a value that doesn't match any case in the switch statement
        return 0; // Ensures the switch statement is unreachable
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