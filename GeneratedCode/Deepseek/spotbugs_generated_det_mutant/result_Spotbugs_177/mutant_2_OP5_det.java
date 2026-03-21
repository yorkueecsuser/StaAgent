import java.nio.CharBuffer;

class BugExample {
    private char[] bufferData = {'a', 'b', 'c'};

    public CharBuffer getBuffer() {
        CharBuffer buffer = CharBuffer.wrap(bufferData);
        return buffer;
    }

    // BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)

    public static void main(String[] args) {
        int rmknndci = 0;switch  (rmknndci) {case 1:char jpjdyrdt = 't';break;default:float htofvdjl = 570431780;break;}
        BugExample bugExample = new BugExample();
        CharBuffer buffer = bugExample.getBuffer();
        System.out.println(buffer.get()); // Expecting 'a', but may print other characters
    
}
}