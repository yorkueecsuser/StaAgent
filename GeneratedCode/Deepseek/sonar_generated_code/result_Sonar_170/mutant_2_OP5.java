class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        int condition = 0;
        
        if (condition == 0) {
            return this.finalize(param);
        } else {
            switch (condition) {
                case 1:
                    return 0;
                default:
                    break;
            }
        }
        
        return this.finalize(param); // Unreachable code
    }
}