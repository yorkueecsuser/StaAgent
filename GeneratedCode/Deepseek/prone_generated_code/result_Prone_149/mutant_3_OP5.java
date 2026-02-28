class SelfAssignmentBug {

    public int showBug(int x) {
        x = x; // Self-assignment bug here

        // Mutant: Unreachable Switch Statement Mutation
        boolean isUnreachable = false;
        if (isUnreachable) {
            switch (x) {
                case 0:
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }

        return x; // BUG: SelfAssignment
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        System.out.println(bug.showBug(5));
    }
}