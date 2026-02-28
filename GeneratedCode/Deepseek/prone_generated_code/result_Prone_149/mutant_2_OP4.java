class SelfAssignmentBug {

    public int showBug(int x) {
        x = x; // Self-assignment bug here
        // Unreachable if-else block added here
        if (false) {
            // This code will never be executed
            System.out.println("This is an unreachable statement");
        } else {
            // This code will always be executed
            System.out.println("This statement is reachable");
        }
        return x; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}