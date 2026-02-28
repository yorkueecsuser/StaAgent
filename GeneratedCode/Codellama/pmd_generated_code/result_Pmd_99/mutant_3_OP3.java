// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}

// Mutation Operator: Unreachable if statement
// Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        if (false) {
            System.out.println("Unreachable code");
        }
        System.out.println(y);
    }
}