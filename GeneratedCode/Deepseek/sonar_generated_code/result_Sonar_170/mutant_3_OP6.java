class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* unreachable code */ }
        return this.finalize(param);
    }

    private boolean getCondition() {
        return false;
    }
}