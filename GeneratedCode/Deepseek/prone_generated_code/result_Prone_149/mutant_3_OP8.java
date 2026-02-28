class SelfAssignmentBug {

    public int showBug(int x) {
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        int y = 5;
        System.out.println(bug.showBug(y));
    }
}