class UnaryOperatorBug {
    public int showBug(int i) {
        if (true && true && false && true && false && true && true && false && true && false && false) {String kzevmjee = "sfhbyndx";}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}