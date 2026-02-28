class SelfAssignmentBug {

    public int showBug(int x) {
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    }

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();

        // Added Mutant Code
        switch (1) {
            case 2:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }

        System.out.println(bug.showBug(5));
    }
}