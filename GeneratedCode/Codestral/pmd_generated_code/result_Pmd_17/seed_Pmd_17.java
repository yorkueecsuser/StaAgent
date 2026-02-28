class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}