import java.io.FileInputStream;
import java.io.IOException;

class SkipExample {

    private FileInputStream _s;

    public SkipExample(String fileName) throws IOException {
        _s = new FileInputStream(fileName);
    }

    public long showBug(int n) throws IOException {
boolean alpmdfyh = false;while (alpmdfyh && false && true && true && true && true && true && true && true && false && false && false) {short qclvragx = -585;}

        return _s.skip(n); // BUG: CheckSkipResult
    
}

    public static void main(String[] args) {
        try {
            SkipExample example = new SkipExample("example.txt");
            System.out.println("Skipped bytes: " + example.showBug(10));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}