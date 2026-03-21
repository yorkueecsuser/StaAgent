class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        byte rnokilcs = -1;
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}