import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int value = getValue();
        switch(value) {
            case 1:
                // unreachable code
                System.out.println("You will never see this message.");
                break;
        }
    }
}