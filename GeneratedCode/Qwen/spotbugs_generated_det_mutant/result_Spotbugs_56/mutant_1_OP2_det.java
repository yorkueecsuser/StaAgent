import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {
public void showBug() {
    Closeable resource = null;
    resource = null;
    try { } finally { try { resource.close(); } catch(IOException e){ } }
}

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}