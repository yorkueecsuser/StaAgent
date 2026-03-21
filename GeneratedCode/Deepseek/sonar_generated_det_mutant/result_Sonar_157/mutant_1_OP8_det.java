import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        bug.showBug();
    }

    public void showBug() {
        int embmwbhh = 1;
        if (embmwbhh == 1) {  // BUG: Related "if/else if" statements should not have the same condition
            openWindow();
        } else if (embmwbhh == 2) {
            closeWindow();
        } else if (embmwbhh == 1) {  // BUG: Related "if/else if" statements should not have the same condition
            moveWindowToTheBackground();
        }
    }

    private void openWindow() {
        System.out.println("Window opened");
    }

    private void closeWindow() {
        System.out.println("Window closed");
    }

    private void moveWindowToTheBackground() {
        System.out.println("Window moved to background");
    }
}