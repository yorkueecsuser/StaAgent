class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = 0;
        if (false) {
            n = s.length(); // Mutant: Unreachable if statement
        }
        return n;
    }
}