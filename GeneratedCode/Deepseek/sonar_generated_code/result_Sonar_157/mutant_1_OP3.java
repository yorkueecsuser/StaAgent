import java.io.IOException;

class MutantCode {
    public void showBug(int param) throws IOException {
        if (param == 1) {
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) { // This line is unreachable due to the "else if (param == 1)".
            moveWindowToTheBackground();
        } else {
            boolean falseCondition = false;
            if (falseCondition) { // This line is added to make the if branch unreachable.
                /* This code will never be executed. */
            }
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