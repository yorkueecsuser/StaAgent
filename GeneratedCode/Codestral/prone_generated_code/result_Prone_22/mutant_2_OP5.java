class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean checkNull() {
        boolean condition = getFalseCondition();
        switch (condition) {
            case true:
                // Unreachable code
                break;
            default:
                return this == null;
        }
    }

    public boolean checkNotNull() {
        boolean condition = getFalseCondition();
        switch (condition) {
            case true:
                // Unreachable code
                break;
            default:
                return this!= null;
        }
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}