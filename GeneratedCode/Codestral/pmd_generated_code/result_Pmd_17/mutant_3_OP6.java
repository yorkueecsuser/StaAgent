class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        boolean unreachable = false;
        for (int j = 0; unreachable; j++) {
            System.out.println("This loop should never execute");
        }
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}