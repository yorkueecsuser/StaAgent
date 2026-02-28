class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    }

    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }
}