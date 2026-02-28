// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        x = x; // Self-assignment bug here
        boolean conditionFor = false; // Unreachable for loop mutation operator
        for (int i = 0; conditionFor; i++) {
            // This is the mutated code which is unreachable as the condition 'conditionFor' is always false
            // This will not be executed and hence, the unreachable statement error will not occur
        }
        return x; // BUG: SelfAssignment
    }

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}