class SelfAssignmentBug {

    public int showBug(int x) {
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
        while (false) { // Unreachable while loop
            System.out.println("This statement is unreachable");
        }
    }
}