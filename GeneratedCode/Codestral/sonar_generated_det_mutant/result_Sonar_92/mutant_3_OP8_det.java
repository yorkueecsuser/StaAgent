class UnaryOperatorBug {
    public int showBug(int i) {
        int tmxieenz = - - -i;  // Bug: Unary prefix operators should not be repeated
        return tmxieenz;
    }

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}