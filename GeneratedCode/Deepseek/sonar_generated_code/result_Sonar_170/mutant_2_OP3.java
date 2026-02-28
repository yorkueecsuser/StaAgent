class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        int unreachableCode = 0;
        if (unreachableCode == 0) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }

        return this.finalize(param);
    }
}