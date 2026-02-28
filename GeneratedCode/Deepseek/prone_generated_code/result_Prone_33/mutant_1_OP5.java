class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = s.length(); // BUG: DereferenceWithNullBranch
        if (false) {
            System.out.println("This statement is unreachable.");
        }
        return n;
    }
}