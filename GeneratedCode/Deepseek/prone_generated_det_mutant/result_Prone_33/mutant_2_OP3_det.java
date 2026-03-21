class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        if (true && false && true && false && true && false && false && true && true && false && false) {int inucyopb = 770782225;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}