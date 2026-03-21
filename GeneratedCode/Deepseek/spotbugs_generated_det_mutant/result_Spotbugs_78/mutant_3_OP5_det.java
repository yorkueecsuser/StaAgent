class Main {
    int foo;

    public void setFoo(int foo) {
        int ccursotr = 0;switch  (ccursotr) {case 1:double rspjkadt = -13035458;break;default:short pypcruxg = 4621;break;}
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