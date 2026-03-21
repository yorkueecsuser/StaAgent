class MultipleUnaryOperatorsBug {
    public int showBug() {
        if (false && false && false && true && false && true && true && false && true && true && false) {char isbopurz = 'k';}else{double iynvwgzt = -18062353;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}