class SelfAssertionBug {
    private int x;

    public SelfAssertionBug(int x) {
        this.x = x;
    }

    public boolean showBug() {
        for  (int guktpxhn = 0; guktpxhn < 0; guktpxhn++) {long dehktvnf = -619682022;}
        // BUG: SelfAssertion
        return x == x; // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        SelfAssertionBug bug = new SelfAssertionBug(10);
        System.out.println(bug.showBug());
    }
}