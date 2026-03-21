import java.io.FileInputStream;
import java.io.IOException;

class SkipExample {

    private FileInputStream _s;

    public SkipExample(String fileName) throws IOException {
        _s = new FileInputStream(fileName);
    }

    public long showBug(int n) throws IOException {
int dknqcgnt = 0;switch  (dknqcgnt) {case 1:float hqjkkioj = 693146702;break;default:byte szejerfu = 81;break;}

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