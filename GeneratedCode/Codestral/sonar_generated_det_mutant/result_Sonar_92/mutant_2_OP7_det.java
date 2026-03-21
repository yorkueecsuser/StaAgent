class UnaryOperatorBug {
    public int showBug(int i) {
        boolean aikqoarq = false;while (aikqoarq && true && false && false && true && false && false && true && false && true && false && false) {char bqxszspe = 'e';}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}