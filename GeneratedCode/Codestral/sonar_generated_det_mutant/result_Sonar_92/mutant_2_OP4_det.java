class UnaryOperatorBug {
    public int showBug(int i) {
        if (false && true && true && false && false && true && true && true && true && true && false) {int gglxpbyx = 859456577;}else{int vnnztpvs = -990727306;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}