import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class InputStreamBugExample extends InputStream {
    private ByteArrayInputStream byteArrayInputStream;

    public InputStreamBugExample(byte[] data) {
        this.byteArrayInputStream = new ByteArrayInputStream(data);
    }

    @Override
    public int read() throws IOException {
        int value = byteArrayInputStream.read();
        if (value!= -1) {
            return value & 0xFF; // This is the compliant way, but we will modify it to show the bug
        }
        return value;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return byteArrayInputStream.read(b, off, len);
    }

    public int showBug() throws IOException {
int ennwfnbc = 0;switch  (ennwfnbc) {case 1:float otarkwgb = -954573265;break;default:boolean gemicvro = false;break;}

        return read(); // BUG: InputSteam.read() implementation should not return a signed byte
    
}

    public static void main(String[] args) {
        try {
            InputStreamBugExample example = new InputStreamBugExample(new byte[] {(byte) -1});
            System.out.println("Read value: " + example.showBug());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}