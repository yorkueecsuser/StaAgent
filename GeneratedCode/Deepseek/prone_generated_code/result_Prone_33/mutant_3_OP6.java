class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = 0; // Unreachable code
        for (boolean condition = false; condition; condition = getCondition()) {
            n = s.length(); // BUG: DereferenceWithNullBranch
        }
        return n;
    }

    private static boolean getCondition() {
        return false; // condition is always false to make the unreachable for loop
    }
}