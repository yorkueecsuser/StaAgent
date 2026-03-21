class MultipleUnaryOperatorsBug {
    public int showBug() {
        int aqoqqgsa = 0;switch  (aqoqqgsa) {case 1:float uwrcjyno = 184230883;break;default:char kynhqjon = 'z';break;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}