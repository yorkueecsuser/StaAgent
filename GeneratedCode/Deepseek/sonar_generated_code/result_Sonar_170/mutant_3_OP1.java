class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    // Mutation Operator: Dead Store
    String deadStoreMutation01;

    public int showBug(int param) {
        // Mutation Operator: Dead Store
        String deadStoreMutation02;

        return this.finalize(param);
    }
}