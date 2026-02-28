class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
        // Unreachable if-else statement
        boolean shouldRun = getCondition(); // getCondition() returns a dynamically determined boolean value at runtime
        if (shouldRun) {
            // code
        } else {
            // alternative code
        }
    }
}