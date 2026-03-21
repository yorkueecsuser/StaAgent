class UnaryOperatorBug {
    public int showBug(int i) {
        if (true && false && false && true && false && true && true && true && true && false && false) {float zfdhbnqj = -683938243;}else{boolean abofhtuc = false;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}