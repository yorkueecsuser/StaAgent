class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        // Unreachable while loop
        boolean unreachable = false;
        while (unreachable) {
            System.out.println("Unreachable");
        }
        return this.finalize(param);
    }
}