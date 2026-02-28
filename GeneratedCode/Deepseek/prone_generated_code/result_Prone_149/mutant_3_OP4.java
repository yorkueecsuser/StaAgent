class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        x = x; // Self-assignment bug here
        boolean shouldRun = true;
        if (shouldRun == false) { 
            System.out.println("This code is unreachable"); 
        } else {
            // This code is not executed, making the if-else statement unreachable
        }
        return x; // BUG: SelfAssignment
    }

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}