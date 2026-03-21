class MultipleUnaryOperatorsBug {
    public int showBug() {
        if (false && true && false && true && false && true && false && true && false && false && false) {String iigqyehz = "ugoydigs";}else{char hantsgae = 'z';}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}