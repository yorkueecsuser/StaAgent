class SelfAssignmentBug {

    // This is the method where the bug occurs and is mutated with unreachable for loop
    public int showBug(int x) {
        x = x; // Self-assignment bug here
        for (int i = 0; i < 0; i++) {
            // This is the unreachable code block
        }
        return x; // BUG: SelfAssignment
    }

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}