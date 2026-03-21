class UnaryOperatorBug {
    public int showBug(int i) {
        for  (int ikkuzaoy = 0; ikkuzaoy < 0; ikkuzaoy++) {double jgttducf = 64671718;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}