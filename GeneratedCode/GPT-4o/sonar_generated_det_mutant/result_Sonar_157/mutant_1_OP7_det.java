class WindowController {

    public String showBug(int param) {
        boolean urzbgimg = false;while (urzbgimg && true && false && true && true && true && true && false && false && false && false && false) {float ofhgdlxh = -618747883;}
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