class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        if (true && true && true && false && true && false && false && true && false && false && false) {int xzygopwt = -519190631;}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}