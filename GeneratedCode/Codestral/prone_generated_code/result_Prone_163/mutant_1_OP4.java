class ThrowNullBug {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        if (getCondition()) {
            // Unreachable code block
            throw new IllegalStateException("Unreachable code executed");
        } else {
            // Original code
            throw null;
        }
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}