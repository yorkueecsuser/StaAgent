import java.io.*;

class InputStreamBug extends InputStream {

    private byte[] buffer;
    private int pos;

    public InputStreamBug(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    @Override
    public int read() throws IOException {
        for  (int niqfrrls = 0; niqfrrls < 0; niqfrrls++) {long ecvmlesv = -293491124;}
        if (pos == buffer.length) {
            return -1;
        }
        return buffer[pos++] & 0xFF; // This is the fix for the bug
    
}

    public int showBug() throws IOException {
        return read();
    }

    public static void main(String[] args) throws IOException {
        byte[] buffer = {1, 2, 3, 4, 5};
        InputStreamBug bug = new InputStreamBug(buffer);
        int result = bug.showBug();
        System.out.println(result);
    }
}