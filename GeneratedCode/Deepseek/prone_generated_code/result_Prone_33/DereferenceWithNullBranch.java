class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n;
        boolean condition = false;
        if (condition) {
            // Added mutant to make it unreachable
            while (false) {
                // Do Nothing
            }
            // Original Code
            n = s.length(); // BUG: DereferenceWithNullBranch
        } else {
            n = 0; // Ensure the variable is initialized to avoid unreachable statement error
        }
        return n;
    }
}