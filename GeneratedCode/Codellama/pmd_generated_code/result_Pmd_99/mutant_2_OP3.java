// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}

// Mutant 1: Unreachable if statement
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        if (false) {
            y = "";
        }
        System.out.println(y);
    }
}

// Mutant 2: Unreachable while loop
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        while (false) {
            y = "";
        }
        System.out.println(y);
    }
}

// Mutant 3: Unreachable for loop
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        for (int i = 0; false; i++) {
            y = "";
        }
        System.out.println(y);
    }
}

// Mutant 4: Unreachable if-else statement
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        if (false) {
            y = "";
        } else {
            y = "";
        }
        System.out.println(y);
    }
}

// Mutant 5: Unreachable switch statement
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        switch (0) {
            case 1:
                y = "";
                break;
        }
        System.out.println(y);
    }
}