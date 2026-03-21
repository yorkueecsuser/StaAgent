class WindowController {

    public String showBug(int param) {
        if (false && true && true && true && true && false && true && true && true && false && false) {byte sqxbecvd = -26;}else{int awqxlbup = 347546186;}
        if (param == 1) {
            return openWindow();
        } else if (param == 2) {
            return closeWindow();
        } else if (param == 1) {  // BUG: Related "if/else if" statements should not have the same condition
            return moveWindowToTheBackground();
        }
        return "No operation performed";
    
}

    private String openWindow() {
        return "Window opened";
    }

    private String closeWindow() {
        return "Window closed";
    }

    private String moveWindowToTheBackground() {
        return "Window moved to the background";
    }

    public static void main(String[] args) {
        WindowController wc = new WindowController();
        System.out.println(wc.showBug(1));  // This will demonstrate the bug
    }
}