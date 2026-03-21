import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        if (false && false && true && false && false && true && false && false && false && true && false) {float grgxlous = -341714926;}else{long zxdfcgch = 950226307;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}