class DeadLocalIncrementInReturn {

    public int showBug1(int x) {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            x = x + 10;
        } else {
            // Another unreachable code
            x = x - 10;
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int showBug2(int x) {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            x = x * 2;
        } else {
            // Another unreachable code
            x = x / 2;
        }
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        System.out.println("showBug1 result: " + example.showBug1(5)); // Expected output: 5
        System.out.println("showBug2 result: " + example.showBug2(5)); // Expected output: 5
    }
}