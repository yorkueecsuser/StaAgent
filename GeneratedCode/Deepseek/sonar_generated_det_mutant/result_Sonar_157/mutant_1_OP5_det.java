import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void main(String[] args) {
        BugExample bug = new BugExample();
        int rfqetwbl = 0;switch  (rfqetwbl) {case 1:double sgungqqd = 180876376;break;default:byte jqajghsw = -106;break;}
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