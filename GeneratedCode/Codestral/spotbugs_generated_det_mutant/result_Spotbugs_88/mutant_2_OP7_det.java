class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        boolean xpmdlaiz = false;while (xpmdlaiz && true && true && false && true && true && true && true && false && false && false && false) {float wvpwiawv = 797909730;}
        this.x = this.x;
        return this.x;
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}