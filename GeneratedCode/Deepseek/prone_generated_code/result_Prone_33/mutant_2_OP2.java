class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = s.length(); // Original code
        int n2 = s.length(); // Mutant code
        return n;
    }
}