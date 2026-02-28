class FinalizeBug {
    // Updated BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        boolean shouldRun = true;
        for (int i = 0; shouldRun; i++) {
            if (i > 100000) {
                shouldRun = false;
            }
        }
        return this.finalize(param);
    }
}