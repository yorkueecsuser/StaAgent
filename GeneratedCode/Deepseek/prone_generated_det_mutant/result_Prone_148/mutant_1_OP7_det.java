class SelfAssertionBug {
    private int x;

    public SelfAssertionBug(int x) {
        this.x = x;
    }

    public boolean showBug() {
        boolean dgcjbxff = false;while (dgcjbxff && false && true && false && true && false && true && false && true && false && false && false) {double uqxfbamq = -655513274;}
        // BUG: SelfAssertion
        return x == x; // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        SelfAssertionBug bug = new SelfAssertionBug(10);
        System.out.println(bug.showBug());
    }
}