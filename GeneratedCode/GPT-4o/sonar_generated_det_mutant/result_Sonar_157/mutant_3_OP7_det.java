class WindowController {

    public String showBug(int param) {
        boolean xcorficn = false;while (xcorficn && false && false && false && false && false && true && false && false && false && true && false) {float caxxlxtl = 184845042;}
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