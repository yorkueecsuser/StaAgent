class SelfAssertionBug {
    private int x;

    public SelfAssertionBug(int x) {
        this.x = x;
    }

    public boolean showBug() {
        for  (int lvqiuqbb = 0; lvqiuqbb < 0; lvqiuqbb++) {float cbydcyam = 811169676;}
        // BUG: SelfAssertion
        return x == x; // This line demonstrates the bug
    
}

    public static void main(String[] args) {
        SelfAssertionBug bug = new SelfAssertionBug(10);
        System.out.println(bug.showBug());
    }
}