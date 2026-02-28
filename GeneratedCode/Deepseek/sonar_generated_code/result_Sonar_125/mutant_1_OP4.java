class Main {
    public static void main(String[] args) {
        System.out.println("Integer Shift Bug: " + showBug(32));
    }

    public static int showBug(int shift) {
        int number = 1;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return number << shift; // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        } else {
            return 0; // This else branch is unreachable because shouldRun is never false.
        }
    }

    private static boolean getCondition(){
        return false;
    }
}