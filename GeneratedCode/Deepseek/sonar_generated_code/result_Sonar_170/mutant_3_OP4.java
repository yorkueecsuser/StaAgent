class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        boolean shouldRun = getCondition(); // A non-final variable is used in the condition
        if (shouldRun) {
            return this.finalize(param);
        } else {
            return 0; // This branch is unreachable due to the condition being 'false'
        }
    }
}