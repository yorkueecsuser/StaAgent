import java.util.Arrays;

class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            int result = Math.min(0, Math.max(100, value));
            System.out.println(result);
        }
    }
}

// Mutant 1: Unreachable if statement
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            if (false) {
                int result = Math.min(0, Math.max(100, value));
                System.out.println(result);
            }
        }
    }
}

// Mutant 2: Unreachable while loop
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            while (false) {
                int result = Math.min(0, Math.max(100, value));
                System.out.println(result);
            }
        }
    }
}

// Mutant 3: Unreachable for loop
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            for (int i = 0; false; i++) {
                int result = Math.min(0, Math.max(100, value));
                System.out.println(result);
            }
        }
    }
}

// Mutant 4: Unreachable if-else statement
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            if (false) {
                int result = Math.min(0, Math.max(100, value));
                System.out.println(result);
            } else {
                // code here will never execute
            }
        }
    }
}

// Mutant 5: Unreachable switch statement
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            switch (0) {
                case 1:
                    int result = Math.min(0, Math.max(100, value));
                    System.out.println(result);
                    break;
                default:
                    // code here will never execute
                    break;
            }
        }
    }
}

// Mutant 6: Unreachable try-catch block
class BuggyCode {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            try {
                int result = Math.min(0, Math.max(100, value));
                System.out.println(result);
            } catch (Exception e) {
                // code here will never execute
            }
        }
    }
}