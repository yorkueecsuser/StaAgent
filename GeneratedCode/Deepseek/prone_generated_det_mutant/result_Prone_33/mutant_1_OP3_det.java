class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        if (false && true && false && true && false && false && false && false && false && false && false) {boolean nkloompe = true;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}