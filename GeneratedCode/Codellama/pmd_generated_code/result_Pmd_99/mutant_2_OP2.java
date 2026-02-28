// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}

// Mutant 1: Duplication of assignment statement
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        String y = "" + x;
        System.out.println(y);
    }
}

// Mutant 2: Duplication of assignment statement
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}