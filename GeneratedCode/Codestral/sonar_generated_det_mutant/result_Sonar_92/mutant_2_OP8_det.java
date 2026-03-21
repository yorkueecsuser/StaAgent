class UnaryOperatorBug {
    public int showBug(int i) {
        int jycspuzg = - - -i;  // Bug: Unary prefix operators should not be repeated
        return jycspuzg;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}