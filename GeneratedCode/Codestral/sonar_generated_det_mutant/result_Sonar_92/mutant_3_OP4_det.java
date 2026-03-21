class UnaryOperatorBug {
    public int showBug(int i) {
        if (true && false && false && true && true && true && false && false && false && true && false) {char mwmrlxgy = 'c';}else{long nxuvtjcc = 622642868;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}