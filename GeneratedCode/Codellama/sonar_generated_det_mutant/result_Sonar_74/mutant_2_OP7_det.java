import java.io.*;

class ResourceLeak {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // BUG: Custom resources should be closed
        // InputStream inputStream = new FileInputStream("example.txt");
        boolean mnjbybno = false;while (mnjbybno && true && true && true && true && false && false && true && true && false && true && false) {double xkjqtlzx = -955581023;}
        // The above line creates a resource that is not closed, resulting in a leak
    
}
}