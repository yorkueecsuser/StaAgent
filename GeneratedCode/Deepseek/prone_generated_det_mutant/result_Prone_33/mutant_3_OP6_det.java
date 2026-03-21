class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        for  (int iwckfdgd = 0; iwckfdgd < 0; iwckfdgd++) {long sxoxwqhi = -77032609;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}