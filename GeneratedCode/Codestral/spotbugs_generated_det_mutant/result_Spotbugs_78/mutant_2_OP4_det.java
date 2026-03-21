class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        if (false && false && false && false && true && false && false && true && false && false && false) {long kabrouks = -685316498;}else{double gmldxzaf = 474482587;}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}