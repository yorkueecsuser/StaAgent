class Main {
    int foo;

    public void setFoo(int foo) {
        boolean bonlzrfv = false;while (bonlzrfv && false && true && false && true && false && false && false && false && true && true && false) {double xhajglfs = -169286329;}
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug() {
        setFoo(10);
        return foo;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }
}