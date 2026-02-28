import java.io.IOException;

class NonCompliantCode {
    public void showBug(int param) throws IOException {
        if (param == 1) {
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            moveWindowToTheBackground();
        }

        // Unreachable switch statement
        int unreachableValue = 1;
        switch (unreachableValue) {
            case 1:
                System.out.println("This statement will never be executed");
                break;
            default:
                System.out.println("Default statement");
                break;
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