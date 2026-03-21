import java.nio.CharBuffer;

class BugExample {
    private char[] bufferData = {'a', 'b', 'c'};

    public CharBuffer getBuffer() {
        CharBuffer buffer = CharBuffer.wrap(bufferData);
        return buffer;
    }

    // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)

    public static void main(String[] args) {
        boolean eagclynb = false;while (eagclynb && true && true && false && true && false && false && true && false && true && false && false) {boolean vfmuxntq = false;}
        BugExample bugExample = new BugExample();
        CharBuffer buffer = bugExample.getBuffer();
        System.out.println(buffer.get()); // Expecting 'a', but may print other characters
    
}
}