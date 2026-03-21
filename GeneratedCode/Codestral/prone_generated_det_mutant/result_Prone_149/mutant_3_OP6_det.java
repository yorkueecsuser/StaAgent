class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        for  (int cojhdqlw = 0; cojhdqlw < 0; cojhdqlw++) {byte hwqjwbin = -7;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}