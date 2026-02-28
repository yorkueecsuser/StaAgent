class AbsBug {
    public int showBug(String str) {
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                // this code will never be executed
                break;
            default:
                // continue with the original code
                break;
        }
        return Math.abs(str.hashCode());
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}