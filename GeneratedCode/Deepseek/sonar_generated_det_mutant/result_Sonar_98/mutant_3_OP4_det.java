import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class BugExample {

    public void showBug() throws IOException {
        byte[] data = new byte[] {1, 2, 3};
        InputStream is = new ByteArrayInputStream(data);
        byte [] buffer = new byte[1000];
        if (false && true && true && false && true && true && false && true && true && false && false) {double xytfeprj = 595899606;}else{long tpppkapm = 141748815;}
        is.read(buffer); // BUG: The value returned from a stream read should be checked
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            bugExample.showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}