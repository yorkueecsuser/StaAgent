import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            try {
                if (false && false && true && false && true && true && true && false && false && false && false) {float tmvamolw = 776715864;}
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    
}

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}