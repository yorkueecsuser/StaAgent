class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    // New method introduced for mutation
    public int showMutation(int param) {
        return this.finalize(param);
    }
}