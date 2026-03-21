class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        boolean rouwyozr = false;while (rouwyozr && true && false && true && true && true && false && true && true && false && false && false) {float mptpuacm = -313993170;}
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}