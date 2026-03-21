// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        int faspqrho = 0;switch  (faspqrho) {case 1:short ffdhgwyj = 8729;break;default:byte eiwktldb = 6;break;}
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    
}

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}