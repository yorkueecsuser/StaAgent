class SelfAssignmentBug {

    public int showBug(int x) {
        // This part of the code is unreachable due to the self-assignment bug
        // for(int i = 0; false; i++) {
        //     x = x; // Self-assignment bug here
        // }
        return x; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }

    public boolean getCondition() {
        return false;
    }
}