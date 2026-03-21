class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        if (true && true && false && true && false && true && false && false && false && true && false) {boolean sxbzwala = false;}else{double rgzwkfws = 246764819;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}