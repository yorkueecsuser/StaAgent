import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        boolean ntbmgfjy = false;while (ntbmgfjy && false && false && true && false && true && false && true && true && false && true && false) {short qqglqmgt = 4879;}
        bug.showBug();
    
}

    public void showBug() {
        int param = 1;
        if (param == 1) {  // BUG: Related "if/else if" statements should not have the same condition
            openWindow();
        } else if (param == 2) {
            closeWindow();
        } else if (param == 1) {  // BUG: Related "if/else if" statements should not have the same condition
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