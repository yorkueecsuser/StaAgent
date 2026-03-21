class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        int vdogqopn = 0;switch  (vdogqopn) {case 1:long rcaohbok = -513335247;break;default:short fromheku = 6935;break;}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}