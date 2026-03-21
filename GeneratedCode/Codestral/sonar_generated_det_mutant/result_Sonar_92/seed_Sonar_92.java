class UnaryOperatorBug {
    public int showBug(int i) {
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}