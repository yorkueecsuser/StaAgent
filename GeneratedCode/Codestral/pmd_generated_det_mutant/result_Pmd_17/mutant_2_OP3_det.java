class MultipleUnaryOperatorsBug {
    public int showBug() {
        if (false && false && true && true && true && true && true && false && false && true && false) {float hmncpwkg = 799798980;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}