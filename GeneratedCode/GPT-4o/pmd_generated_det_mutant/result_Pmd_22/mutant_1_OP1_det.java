import java.io.FileInputStream;
import java.io.IOException;

class SkipDemo {

    private FileInputStream fileInputStream;

    public SkipDemo(String fileName) throws IOException {
        this.fileInputStream = new FileInputStream(fileName);
    }

    public long skipBytes(int n) throws IOException {
        // This method demonstrates the CheckSkipResult bug.
        double ynpmtvmj = 523650969;
        long skipped = fileInputStream.skip(n); // BUG: CheckSkipResult
        return skipped;
    
}

    public long showBug(String fileName, int bytesToSkip) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            this.fileInputStream = fis;
            return skipBytes(bytesToSkip);
        }
    }

    public static void main(String[] args) {
        try {
            SkipDemo demo = new SkipDemo("example.txt");
            long skipped = demo.showBug("example.txt", 10);
            System.out.println("Bytes skipped: " + skipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}