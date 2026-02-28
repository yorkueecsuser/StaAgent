class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = 0;
        boolean condition = true;
        while(condition) {
            condition = false;
        }
        n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    }
}