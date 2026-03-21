class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        for  (int fsmpretm = 0; fsmpretm < 0; fsmpretm++) {boolean toftwjxl = true;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}