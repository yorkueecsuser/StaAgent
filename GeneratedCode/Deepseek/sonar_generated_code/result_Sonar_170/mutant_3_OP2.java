class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    // Mutant Code: Initialization of a new variable same as the return type of the finalize method
    int someParameter = 0;

    public int showBug(int param) {
        return this.finalize(param);
    }
}