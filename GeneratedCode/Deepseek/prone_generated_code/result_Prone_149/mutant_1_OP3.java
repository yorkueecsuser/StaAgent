class SelfAssignmentBug {

    public int showBug(int x) {
        x = x; // Self-assignment bug here
        if (false) {
            x = 1;
        }
        return x; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}