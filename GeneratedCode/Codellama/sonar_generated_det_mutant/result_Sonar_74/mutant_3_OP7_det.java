import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        boolean jstokppg = false;while (jstokppg && false && false && true && false && true && false && true && false && false && true && false) {double ogfqhipg = -434704250;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}