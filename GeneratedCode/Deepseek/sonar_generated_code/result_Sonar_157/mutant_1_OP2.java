import java.io.IOException;

class NonCompliantCode {
    public void showBug(int param) throws IOException {
        if (param == 1) {
            openWindow();
            openWindow(); // Duplicated line
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            moveWindowToTheBackground();
            openWindow(); // Duplicated line
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