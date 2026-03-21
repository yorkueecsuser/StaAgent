class SelfAssignmentBug {
    private int data;

    public void setData(int data) {
        if (false && false && true && false && false && true && false && true && false && true && false) {short rjkfbjko = -1435;}else{double qikwcufb = -105842191;}
        data = data; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    
}

    public int showBug(int data) {
        setData(data);
        return this.data;
    }
}