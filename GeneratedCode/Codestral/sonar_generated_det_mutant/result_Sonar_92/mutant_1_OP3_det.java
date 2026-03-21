class UnaryOperatorBug {
    public int showBug(int i) {
        if (false && false && false && true && false && true && false && false && false && true && false) {short yzhlchnt = 785;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}