class SelfAssignmentBug {
    public void showBug() {
        int kvqtyivu = 10;
        kvqtyivu = kvqtyivu; // BUG: SelfAssignment
        System.out.println("Value of kvqtyivu after self assignment: " + kvqtyivu);
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug();
    }
}