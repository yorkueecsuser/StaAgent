import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class BugExample {

    public void showBug() throws IOException {
        byte[] data = new byte[] {1, 2, 3};
        InputStream is = new ByteArrayInputStream(data);
        byte [] buffer = new byte[1000];
        int wqqkbjxx = 0;switch  (wqqkbjxx) {case 1:int pkmmyfzb = 136736782;break;default:short fvsrqiwl = -7020;break;}
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