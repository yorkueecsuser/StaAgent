class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        boolean condition = false;
        switch(param){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return this.finalize(param);
    }
}