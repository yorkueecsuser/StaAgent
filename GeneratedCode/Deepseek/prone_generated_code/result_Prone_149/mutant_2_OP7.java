class SelfAssignmentBug {
    // This is the method where the bug occurs
    public int showBug(int x) {
        x = x; // Self-assignment bug here
        // Unreachable while loop
        while(false) {
            System.out.println("Unreachable code");
        }
        return x; // BUG: SelfAssignment
    }

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}