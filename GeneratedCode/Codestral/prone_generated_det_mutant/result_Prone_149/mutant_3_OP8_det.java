class SelfAssignmentBug {
    public void showBug() {
        int hxethlce = 10;
        hxethlce = hxethlce; // BUG: SelfAssignment
        System.out.println("Value of hxethlce after self assignment: " + hxethlce);
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}