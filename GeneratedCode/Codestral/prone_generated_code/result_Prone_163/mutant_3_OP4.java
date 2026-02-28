class ThrowNullBug {
    public void showBug() {
        if (getCondition()) {
            // unreachable code
            throw new RuntimeException("Unreachable code");
        } else {
            throw null;
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}