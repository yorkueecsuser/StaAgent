// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        if (false && true && false && true && true && true && false && true && true && true && false) {float nbragnmu = -569030250;}else{byte sgcfvbqs = -83;}
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    
}

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}