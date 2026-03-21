class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        if (true && true && true && false && true && true && false && true && true && false && false) {float trsornkb = -606435263;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}