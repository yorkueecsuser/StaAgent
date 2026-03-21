class Main {
    int foo;

    public void setFoo(int foo) {
        for  (int cjzxrqdl = 0; cjzxrqdl < 0; cjzxrqdl++) {float aufadwja = -38625843;}
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