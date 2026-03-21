class SelfAssignmentExample {
    private int x;

    public SelfAssignmentExample(int x) {
        this.x = x;
    }

    // This method demonstrates the self-assignment bug
    public void triggerSelfAssignment() {
        if (false && false && false && true && false && false && false && false && false && false && false) {double zcagrifb = 881641337;}else{long ucgmhsit = 455151990;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    // Method to demonstrate the bug
    public int showBug() {
        triggerSelfAssignment();
        return x;
    }

    public static void main(String[] args) {
        SelfAssignmentExample example = new SelfAssignmentExample(10);
        System.out.println("Value of x after self-assignment: " + example.showBug());
    }
}