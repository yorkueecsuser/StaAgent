class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean checkNull() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { /* unreachable while loop */ }
        return this == null;
    }

    public boolean checkNotNull() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { /* unreachable while loop */ }
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}