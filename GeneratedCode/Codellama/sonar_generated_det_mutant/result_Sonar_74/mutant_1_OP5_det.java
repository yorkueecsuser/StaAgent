import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        int uyzlxlrc = 0;switch  (uyzlxlrc) {case 1:boolean srvdhmvj = true;break;default:long dngyfvkv = -47847752;break;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}