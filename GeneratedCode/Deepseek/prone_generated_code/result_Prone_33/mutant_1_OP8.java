class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String str = null;
        int n = str.length(); // BUG: DereferenceWithNullBranch
        return n;
    }
}