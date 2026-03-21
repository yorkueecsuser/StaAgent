class MultipleUnaryOperatorsBug {
    public int showBug() {
        boolean uutlgocs = false;while (uutlgocs && true && true && false && true && true && false && true && false && true && true && false) {double hkxhuuan = 387195900;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}