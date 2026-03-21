class SelfAssignmentExample {
    private int x;

    public SelfAssignmentExample(int x) {
        this.x = x;
    }

    // This method demonstrates the self-assignment bug
    public void triggerSelfAssignment() {
        for  (int gzaatngn = 0; gzaatngn < 0; gzaatngn++) {float fynnndoq = 145542811;}
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