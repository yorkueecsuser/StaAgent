class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int showBug(int inputValue) {
        // Added a loop that does nothing to demonstrate Equivalent Loop Replacement
        for (int i = 0; i < 1; i++) {
            setFoo(inputValue);
        }

        // Equivalent do-while loop mutant
        int j = 0;
        do {
            setFoo(inputValue);
            j++;
        } while (j < 1);

        return foo;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println("Expected to set foo to 10, but got: " + bugDemo.showBug(10));
    }
}