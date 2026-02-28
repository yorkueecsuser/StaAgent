class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean checkNull() {
        boolean falseCondition = getFalseCondition();
        if (falseCondition) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        } else {
            return this == null;
        }
    }

    public boolean checkNotNull() {
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}