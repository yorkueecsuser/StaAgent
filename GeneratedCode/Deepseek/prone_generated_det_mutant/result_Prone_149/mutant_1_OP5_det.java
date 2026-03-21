// This is the main class where the bug is present
class SelfAssignmentBug {

    // This is the method where the bug occurs
    public int showBug(int x) {
        int vshrekcc = 0;switch  (vshrekcc) {case 1:byte cpaanesl = 10;break;default:int pdkephgd = -786782439;break;}
        x = x; // Self-assignment bug here
        return x; // BUG: SelfAssignment
    
}

    // Main method to run the program
    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}