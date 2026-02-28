class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        
        // Adding unreachable if-else statement
        boolean randomCondition = getRandomCondition(); // Non-final variable to ensure it's not a compile-time constant
        if (randomCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code will always execute.");
        }
    }

    public int showBug(int value) {
        setFoo(value);
        return this.foo;
    }

    private boolean getRandomCondition() {
        return false; // Ensures the if block is unreachable
    }

    public static void main(String[] args) {
        SelfAssignmentBugExample example = new SelfAssignmentBugExample();
        int result = example.showBug(10);
        System.out.println("The value of foo is: " + result);
    }
}