class UnaryOperatorBug {
    public int showBug(int i) {
        int ysmqpbnx = 0;switch  (ysmqpbnx) {case 1:char adiqfvyb = 's';break;default:long tkiuiaar = -28272088;break;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}