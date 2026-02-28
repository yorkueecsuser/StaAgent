class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        boolean shouldRun = false;
        if (shouldRun) {
            return this.finalize(param);
        } else {
            return param;
        }
    }
}