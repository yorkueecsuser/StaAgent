class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        // Mutation: Renaming variable "someParameter" to "a"
        int a = this.finalize(param);
        return a;
    }
}