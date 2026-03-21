class UnaryOperatorBug {
    public int showBug(int i) {
        if (false && false && false && false && true && true && true && true && false && false && false) {long fvorogkw = 323229090;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}