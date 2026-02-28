import java.io.IOException;

class NonCompliantCode {
    public void showBug(int param) throws IOException {
        // BUG: Unreachable while loop mutation
        boolean unreachableLoop = false;
        while(unreachableLoop) {
            System.out.println("Unreachable loop detected");
        }

        if (param == 1) {
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            moveWindowToTheBackground();
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