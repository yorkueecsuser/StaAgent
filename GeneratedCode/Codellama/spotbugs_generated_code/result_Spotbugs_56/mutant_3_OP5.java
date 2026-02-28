import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            switch (getCondition()) {
                case 1:
                    // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
                    resource.close();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to dynamically determine the switch expression at runtime
    private static int getCondition() {
        return 0;
    }
}