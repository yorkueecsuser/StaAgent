class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    // Mutation: Duplication - Duplicating a randomly selected assignment statement
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        // Mutation: Duplication - Duplicating a randomly selected assignment statement
        return this.finalize(param);
        return this.finalize(param);
    }
}