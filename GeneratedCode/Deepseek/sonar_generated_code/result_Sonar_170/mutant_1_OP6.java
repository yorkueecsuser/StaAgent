class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        /* Added a unreachable for loop */
        for(boolean condition = false; condition; condition = false) {
            System.out.println("This is an unreachable for loop.");
        }
        return this.finalize(param);
    }
}