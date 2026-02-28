class BugExample {

    public Object showBug() {
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();

        // Mutation Operator: Inserting unreachable if branch into a randomly selected basic block in the program. 
        // The condition of the inserted branch is always false to make it unreachable.
        // Unreachable code: if (false) { System.out.println("This line is unreachable due to false condition"); }

        // Mutation Operator: Inserting unreachable if branch into a randomly selected basic block in the program. 
        // The condition of the inserted branch is always false to make it unreachable.
        // Unreachable code: if (false) { System.out.println("This line is unreachable due to false condition"); 
        // big, complex piece of code here
        // big, complex piece of code here }
    }
}