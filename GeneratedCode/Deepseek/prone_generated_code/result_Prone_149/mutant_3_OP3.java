// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment

        boolean unreachable = false;
        if (unreachable) {
            System.out.println("This statement is unreachable due to a bug caused by the mutation operator");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}