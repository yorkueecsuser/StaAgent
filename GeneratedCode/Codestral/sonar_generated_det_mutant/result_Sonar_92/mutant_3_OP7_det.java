class UnaryOperatorBug {
    public int showBug(int i) {
        boolean kufgyvsy = false;while (kufgyvsy && true && true && false && true && true && false && true && true && false && true && false) {int gogiqtug = -941290441;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}