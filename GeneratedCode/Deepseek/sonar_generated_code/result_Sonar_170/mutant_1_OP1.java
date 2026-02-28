class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        String deadStoreVariable = "abcdefgh"; // Dead Store Mutation Operator: Inserting unused variable with a random name
        return this.finalize(param);
    }
}