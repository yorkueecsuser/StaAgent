class UnaryOperatorBug {
    public int showBug(int i) {
        int jwilnhlc = 0;switch  (jwilnhlc) {case 1:long dfhnolpa = 925411186;break;default:float bqgrsvot = -46794581;break;}
        int j = - - -i;  // Bug: Unary prefix operators should not be repeated
        return j;
    
}

    public static void main(String[] args) {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        System.out.println(bug.showBug(5));
    }
}