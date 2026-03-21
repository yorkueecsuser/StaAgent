class MultipleUnaryOperatorsBug {
    public int showBug() {
        boolean qdrsqmrl = false;while (qdrsqmrl && false && true && true && false && true && true && false && false && false && true && false) {String yzzmrydz = "ohdrhfwr";}
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    
}

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}