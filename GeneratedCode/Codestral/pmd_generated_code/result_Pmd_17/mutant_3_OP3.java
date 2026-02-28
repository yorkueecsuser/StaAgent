class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        if (getUnreachableCondition()) { // Added unreachable if branch
            System.out.println("This line will never be executed.");
        }
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }

    private static boolean getUnreachableCondition() {
        return false; // Always false to make it unreachable
    }
}