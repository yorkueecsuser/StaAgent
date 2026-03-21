class SelfAssignmentBug {
    public void showBug() {
        int x = 10;
        for  (int qgwgyaww = 0; qgwgyaww < 0; qgwgyaww++) {short awuacwor = 6396;}
        x = x; // BUG: SelfAssignment
        System.out.println("Value of x after self assignment: " + x);
    
}

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}