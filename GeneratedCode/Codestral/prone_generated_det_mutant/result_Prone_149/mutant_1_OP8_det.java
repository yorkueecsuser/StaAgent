class SelfAssignmentBug {
    public void showBug() {
        int ibpuylio = 10;
        ibpuylio = ibpuylio; // BUG: SelfAssignment
        System.out.println("Value of ibpuylio after self assignment: " + ibpuylio);
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}