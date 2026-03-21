// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        boolean xfhpycua = false;while (xfhpycua && false && true && true && false && true && false && false && true && true && false && false) {int nmgzqdhj = -594628391;}
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    
}

    public byte[] showBug() {
        return buffer;
    }
}