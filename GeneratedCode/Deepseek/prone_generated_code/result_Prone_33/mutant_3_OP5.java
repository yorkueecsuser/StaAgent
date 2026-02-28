class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n;
        if (getCondition()) {
            n = s.length(); // BUG: DereferenceWithNullBranch
        } else {
            n = 0;
        }
        return n;
    }

    public static boolean getCondition() {
        return false;
    }
}