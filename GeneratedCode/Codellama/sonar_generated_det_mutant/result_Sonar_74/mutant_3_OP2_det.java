import java.io.*;

class ResourceLeak {
public static void main(String [] args)throws IOException {
    InputStream inputStream = new FileInputStream("example.txt");
    inputStream = new FileInputStream("example.txt");
}
}