import java.io.*;

class BugExample {
    public void showBug() {
        try {
            // do something
            throw new IOException("An IOException occurred");
        } catch (IOException ee) {
            // Avoid unreachable code by using a non-final variable or an equivalent method call.
            boolean alwaysTrue = true;
            if (alwaysTrue) {
                cleanup();
            }
        }
    }

    private void cleanup() {
        System.out.println("Cleanup performed");
    }
}