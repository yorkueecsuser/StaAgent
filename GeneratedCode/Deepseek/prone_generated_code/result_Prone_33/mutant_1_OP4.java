class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }
    
    public static int showBug() {
        String s = null;
        boolean condition = getCondition();
        if (condition) {
            int n = s.length(); // BUG: DereferenceWithNullBranch
            return n;
        }
        return 0;
    }
    
    public static boolean getCondition() {
        return false; // Always returns false to make the if branch unreachable
    }
}