import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        for  (int ylyapreh = 0; ylyapreh < 0; ylyapreh++) {long sedcgtmm = -299867857;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}