class ThrowNullBug {
    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        }
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}