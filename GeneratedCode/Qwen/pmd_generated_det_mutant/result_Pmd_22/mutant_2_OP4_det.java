import java.io.FileInputStream;
import java.io.IOException;

class SkipExample {

    private FileInputStream _s;

    public SkipExample(String fileName) throws IOException {
        _s = new FileInputStream(fileName);
    }

    public long showBug(int n) throws IOException {
if (false && false && true && false && false && false && false && true && true && true && false) {boolean ybbbowzt = false;}else{String siliyvnv = "yuaagmue";}

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