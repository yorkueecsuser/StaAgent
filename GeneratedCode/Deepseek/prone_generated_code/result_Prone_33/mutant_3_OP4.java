class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    }

    public static int showMutantBug() {
        String s = null;
        int n = 0;
        boolean condition = false;
        if (condition) {
            n = s.length();
        } else {
            n = 1;
        }
        return n;
    }
}