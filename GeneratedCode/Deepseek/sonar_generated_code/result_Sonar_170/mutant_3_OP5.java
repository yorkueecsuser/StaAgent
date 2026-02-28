class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        finalize(param);
        int unreachable = 10; // Unreachable statement for Unreachable Switch Mutation
        switch (unreachable) { // Unreachable switch statement
            case 1: 
                // Mutation: Replace with 'default' to avoid unreachable statement
                break;
            default:
                break;
        }
        return param;
    }
}