class Main {
    int foo;

    public void setFoo(int foo) {
        int xxyfxbqy = 0;switch  (xxyfxbqy) {case 1:double cyfwubxe = -254254114;break;default:byte mmqiqenp = -68;break;}
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