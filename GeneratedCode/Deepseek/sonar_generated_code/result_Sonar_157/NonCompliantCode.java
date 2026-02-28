import java.io.IOException;

class NonCompliantCode {
    public void showBug(int param) throws IOException {
        if (param == 1) {
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { 
            moveWindowToTheBackground();
        }
        boolean condition = false; // This is a non-final variable and is not a compile-time constant
        while (condition) { 
            // This is an unreachable while loop with condition false directly 
        }
    }

    private void openWindow() throws IOException {
        System.out.println("Opening Window");
    }

    private void closeWindow() throws IOException {
        System.out.println("Closing Window");
    }

    private void moveWindowToTheBackground() throws IOException {
        System.out.println("Moving Window to Background");
    }
}