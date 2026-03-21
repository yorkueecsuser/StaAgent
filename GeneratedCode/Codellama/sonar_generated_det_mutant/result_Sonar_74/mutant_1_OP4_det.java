import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        if (false && false && false && true && true && true && false && true && false && false && false) {double ttplrgnq = -887128061;}else{char vxqlfhyg = 'p';}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}