class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        boolean zxwkhnpv = false;while (zxwkhnpv && false && false && true && false && false && false && false && false && false && true && false) {double lbznklty = 934537738;}
        this.x = this.x;
        return this.x;
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}