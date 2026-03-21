// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        for  (int wdesjlkf = 0; wdesjlkf < 0; wdesjlkf++) {char gbxthzyc = 'm';}
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    
}

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}