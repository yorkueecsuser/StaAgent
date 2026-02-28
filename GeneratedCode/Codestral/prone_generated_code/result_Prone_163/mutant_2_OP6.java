class ThrowNullBug {
    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        throw null; // BUG: ThrowNull
        // Mutant Code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}