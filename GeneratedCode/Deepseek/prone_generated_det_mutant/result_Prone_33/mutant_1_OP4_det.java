class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        if (true && true && false && true && false && false && true && true && true && true && false) {double qpnvdhya = -535389247;}else{char cctgwurk = 'e';}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}