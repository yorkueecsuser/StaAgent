class SelfAssignmentBug {

    private int foo;

    public void setFoo(int foo) {
        boolean lpmbgxku = false;while (lpmbgxku && true && true && false && true && false && false && true && false && true && false && false) {short tnhflqzw = 8469;}
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int inputValue) {
        setFoo(inputValue);
        return foo;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println("Expected to set foo to 10, but got: " + bugDemo.showBug(10));
    }
}