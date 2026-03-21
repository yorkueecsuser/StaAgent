class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        boolean itryjvuv = false;while (itryjvuv && true && false && true && false && false && false && false && false && true && false && false) {String tttmcyhw = "qzbunesd";}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}