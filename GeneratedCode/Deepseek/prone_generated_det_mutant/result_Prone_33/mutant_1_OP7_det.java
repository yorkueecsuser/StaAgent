class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        boolean vpqwjcoj = false;while (vpqwjcoj && false && false && true && false && false && true && true && true && false && true && false) {boolean ruxlzzmr = true;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}