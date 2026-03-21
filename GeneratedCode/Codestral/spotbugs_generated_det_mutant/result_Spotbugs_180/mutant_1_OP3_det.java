// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        if (false && false && true && true && true && false && true && false && false && true && false) {boolean bjlpqxid = false;}
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    
}

    public byte[] showBug() {
        return buffer;
    }
}