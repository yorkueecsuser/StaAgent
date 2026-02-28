class MultipleUnaryOperatorsBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int i = - -1;
        if (getUnreachableCondition()) { // Unreachable if statement
            System.out.println("This statement should never be executed.");
        }
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}