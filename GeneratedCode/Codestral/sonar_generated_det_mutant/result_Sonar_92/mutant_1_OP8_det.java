class UnaryOperatorBug {
    public int showBug(int i) {
        int oknjcsvw = - - -i;  // Bug: Unary prefix operators should not be repeated
        return oknjcsvw;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}