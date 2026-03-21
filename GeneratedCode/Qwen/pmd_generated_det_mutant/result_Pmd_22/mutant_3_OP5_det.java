import java.io.FileInputStream;
import java.io.IOException;

class SkipExample {

    private FileInputStream _s;

    public SkipExample(String fileName) throws IOException {
        _s = new FileInputStream(fileName);
    }

    public long showBug(int n) throws IOException {
int ztagtiqg = 0;switch  (ztagtiqg) {case 1:float njgjjusv = -413208982;break;default:boolean ilutjktn = false;break;}

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