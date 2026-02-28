class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}

// Mutant 1: Renaming of variable "num" to "input"
class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int input) {
        int result = Math.min(UPPER, input);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}

// Mutant 2: Renaming of variable "result" to "output"
class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int output = Math.min(UPPER, num);
        return Math.max(LOWER, output); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}

// Mutant 3: Renaming of variable "UPPER" to "MAX"
class MinMaxBug {
    private static final int MAX = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(MAX, num);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}

// Mutant 4: Renaming of variable "LOWER" to "MIN"
class MinMaxBug {
    private static final int UPPER = 20;
    private static final int MIN = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        return Math.max(MIN, result); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}