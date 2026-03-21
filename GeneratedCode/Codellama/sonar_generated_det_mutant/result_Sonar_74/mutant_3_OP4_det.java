import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        if (true && true && false && false && true && false && true && false && true && true && false) {byte rgnfgweg = 80;}else{float ypaatcok = -51235150;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}