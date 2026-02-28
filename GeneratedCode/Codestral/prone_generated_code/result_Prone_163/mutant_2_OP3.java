class ThrowNullBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        throw null; // BUG: ThrowNull
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        }
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}