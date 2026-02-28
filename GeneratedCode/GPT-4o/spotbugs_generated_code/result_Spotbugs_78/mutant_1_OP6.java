class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)

        // Adding an unreachable for loop as a mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    private boolean getCondition() {
        return false; // always returns false, making the loop unreachable
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