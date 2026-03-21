class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        char yqmydevc = 'c';
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}