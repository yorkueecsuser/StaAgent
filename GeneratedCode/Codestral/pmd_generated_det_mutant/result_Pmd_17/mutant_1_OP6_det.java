class MultipleUnaryOperatorsBug {
    public int showBug() {
        for  (int xyiwcehi = 0; xyiwcehi < 0; xyiwcehi++) {float mqymycnr = 765642879;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}