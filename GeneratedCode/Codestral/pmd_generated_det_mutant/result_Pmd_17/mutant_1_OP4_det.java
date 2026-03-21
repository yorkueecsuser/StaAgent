class MultipleUnaryOperatorsBug {
    public int showBug() {
        if (true && true && true && true && false && false && false && false && true && false && false) {double bqsuicth = -471323440;}else{short rwykuahg = 971;}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}