class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        unreachableSwitchStatement();
        return i;
    }

    private void unreachableSwitchStatement() {
        boolean condition = false;
        int value = 1;
        if (condition) {
            switch (value) {
                case 1:
                    // This code will never be executed
                    break;
                default:
                    // This code will never be executed
                    break;
            }
        }
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}