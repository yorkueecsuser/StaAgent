class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        boolean isNull = (s == null);
        if (isNull) {
            for (; false;) {
                // Unreachable code
                int n = s.length(); // Mutated BUG: DereferenceWithNullBranch
                return n;
            }
        }
        return 0;
    }
}