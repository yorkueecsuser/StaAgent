class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        String aekgbywh = "syhnczzz";
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}