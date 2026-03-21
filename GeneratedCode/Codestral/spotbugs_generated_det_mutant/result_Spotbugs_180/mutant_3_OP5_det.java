// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        int orvoyxnt = 0;switch  (orvoyxnt) {case 1:short icabiicj = -2030;break;default:boolean jcuxpvzc = false;break;}
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    
}

    public byte[] showBug() {
        return buffer;
    }
}