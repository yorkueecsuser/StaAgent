class UnaryOperatorBug {
    public int showBug(int i) {
        for  (int egoxompc = 0; egoxompc < 0; egoxompc++) {short zttzgtbz = 7203;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}