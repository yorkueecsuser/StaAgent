// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        if (false && false && true && true && true && true && true && true && true && true && false) {double zkghasaa = 324090229;}else{long cbqnpoev = -941133326;}
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    
}

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}