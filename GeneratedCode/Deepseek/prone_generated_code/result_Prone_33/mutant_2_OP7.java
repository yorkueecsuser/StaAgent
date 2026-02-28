class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = s.length(); // BUG: DereferenceWithNullBranch
        boolean shouldRun = getCondition();
        while (shouldRun) {
            int x = 1; // unreachable code
        }
        return n;
    }

    // Added method to return non-final variable or equivalent method call for the condition
    public static boolean getCondition() {
        return false;
    }
}