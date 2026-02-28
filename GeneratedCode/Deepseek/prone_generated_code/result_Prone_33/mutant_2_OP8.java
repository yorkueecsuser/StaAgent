class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        // Mutant code: String s = "mutant";
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    }
}