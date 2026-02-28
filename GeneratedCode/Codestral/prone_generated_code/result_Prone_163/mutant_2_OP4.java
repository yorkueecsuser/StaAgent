class ThrowNullBug {
    public void showBug() {
        if (getCondition()) {
            // Unreachable code
            System.out.println("This is an unreachable block.");
        } else {
            throw null; // BUG: ThrowNull
        }
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}