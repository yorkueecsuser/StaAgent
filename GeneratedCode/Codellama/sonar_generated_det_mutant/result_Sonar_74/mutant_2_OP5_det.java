import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        int gxxnhikf = 0;switch  (gxxnhikf) {case 1:byte tbkdznca = -13;break;default:boolean qdhgvnbh = false;break;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}