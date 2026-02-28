class ThrowNullBug {
    public void showBug() {
        boolean condition = getCondition();
        while (condition) { // Inserting unreachable while loop
            int i = 0;
            i++;
        }
        throw null; // Original code
    }

    public boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}