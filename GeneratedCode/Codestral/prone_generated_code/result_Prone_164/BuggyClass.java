class BuggyClass {
    void buggyMethod() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { }
        System.out.println(this.toString()); // BUG: TreeToString
    }
    private boolean getCondition() { return false; }
}