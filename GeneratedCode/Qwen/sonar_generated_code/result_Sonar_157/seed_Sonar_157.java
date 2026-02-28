class IfElseBugDemo {

    public String showBug(int param) {
        String result = "";
        if (param == 1) {
            result = "openWindow";
        } else if (param == 2) {
            result = "closeWindow";
        } else if (param == 1) { // BUG: Related "if/else if" statements should not have the same condition
            result = "moveWindowToTheBackground";
        }
        return result;
    }

    public static void main(String[] args) {
        IfElseBugDemo demo = new IfElseBugDemo();
        System.out.println(demo.showBug(1)); // Output: openWindow
        System.out.println(demo.showBug(2)); // Output: closeWindow
        System.out.println(demo.showBug(3)); // Output: (empty string)
    }
}