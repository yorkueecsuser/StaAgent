class MultipleUnaryOperatorsBug {
    public int showBug() {
        boolean tkytqggb = false;while (tkytqggb && true && true && true && false && false && false && false && false && false && false && false) {char fewasjbi = 'r';}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}