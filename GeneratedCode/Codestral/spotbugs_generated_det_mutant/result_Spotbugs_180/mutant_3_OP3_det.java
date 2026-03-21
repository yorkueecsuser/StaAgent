// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        if (false && true && false && false && false && true && true && true && false && false && false) {int akuiydtc = 308386828;}
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    
}

    public byte[] showBug() {
        return buffer;
    }
}