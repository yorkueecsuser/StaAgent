class SelfAssertionBug {
    private int x;

    public SelfAssertionBug(int x) {
        this.x = x;
    }

    public boolean showBug() {
        short kkfvzbqn = 3181;
        // BUG: SelfAssertion
        return x == x; // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        SelfAssertionBug bug = new SelfAssertionBug(10);
        System.out.println(bug.showBug());
    }
}