import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        boolean flrclbmy = false;while (flrclbmy && true && false && false && false && true && true && false && false && true && true && false) {double epnffvmc = 680901300;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}