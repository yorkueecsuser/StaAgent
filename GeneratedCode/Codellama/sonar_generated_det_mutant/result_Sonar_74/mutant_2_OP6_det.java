import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        for  (int midunpqw = 0; midunpqw < 0; midunpqw++) {double cyvuxqgk = -606435121;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}