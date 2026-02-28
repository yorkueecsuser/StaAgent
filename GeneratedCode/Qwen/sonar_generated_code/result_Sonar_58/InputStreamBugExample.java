import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class InputStreamBugExample {

    private InputStream inputStream;

    public InputStreamBugExample(byte[] data) {
        this.inputStream = new ByteArrayInputStream(data);
    }

    public int readFromInputStream() throws IOException {
        return inputStream.read(); // BUG: InputSteam.read() implementation should not return a signed byte
    }

    public int showBug(byte[] data) throws IOException {
        InputStreamBugExample example = new InputStreamBugExample(data);
        return example.readFromInputStream();
    }

    public static void main(String[] args) {
        try {
            InputStreamBugExample example = new InputStreamBugExample(new byte[]{(byte) -128});
            System.out.println("Read value: " + example.showBug(new byte[]{(byte) -128}));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}