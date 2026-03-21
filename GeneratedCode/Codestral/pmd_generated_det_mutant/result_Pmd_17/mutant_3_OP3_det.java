class MultipleUnaryOperatorsBug {
    public int showBug() {
        if (false && false && true && false && true && true && true && true && false && false && false) {char hzwebldz = 'b';}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}