class SelfAssignmentBug {

    public int showBug(int x) {
        int y = x; // Mutated line: Renamed the variable 'x' to 'y'
        return y; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}