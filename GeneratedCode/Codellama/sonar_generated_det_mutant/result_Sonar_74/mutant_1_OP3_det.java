import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        if (true && false && true && false && true && true && false && false && true && false && false) {double xfjvyzeh = 558556824;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}