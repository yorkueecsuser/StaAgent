import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        int ttdhyhrs = 0;switch  (ttdhyhrs) {case 1:double xvchqiwx = 656915894;break;default:short mdtyptms = 984;break;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}