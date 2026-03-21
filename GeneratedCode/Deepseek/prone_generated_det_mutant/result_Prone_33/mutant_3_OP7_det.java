class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        boolean lltbcssr = false;while (lltbcssr && true && true && true && false && true && true && false && true && false && false && false) {char smbkglcn = 'y';}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}