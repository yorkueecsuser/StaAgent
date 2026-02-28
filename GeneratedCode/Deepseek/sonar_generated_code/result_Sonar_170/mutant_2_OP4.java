class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        if (false) { // Mutation: Unreachable if-else statement
            System.out.println("This is an unreachable code");
        } else {
            return this.finalize(param);
        }
        return 0; // To avoid unreachable statement error
    }
}