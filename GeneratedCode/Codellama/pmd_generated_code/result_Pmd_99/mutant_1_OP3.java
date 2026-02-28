// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}

// Mutant 1: Unreachable if statement (line 6)
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        if (false) {
            System.out.println("This statement is always false");
        }
        System.out.println(y);
    }
}

// Mutant 2: Unreachable if statement (line 8)
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        if (true) {
            System.out.println("This statement is always true");
        } else {
            System.out.println("This statement is unreachable");
        }
        System.out.println(y);
    }
}