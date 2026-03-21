class SelfAssignmentBugExample {

    private int foo;

    public void setFoo(int foo) {
        int qgdyupgk = 0;switch  (qgdyupgk) {case 1:short jfyrszaw = 4978;break;default:char olkrwmnq = 'z';break;}
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
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