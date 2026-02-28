class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        String deadStore = "abcdefgh"; // Additional dead store variable
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    }
}