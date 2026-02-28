import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }
    
    public static void main(String[] args) {
        String name = "Alice";
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Hello, " + name);
                break;
            default:
                System.out.println("Hello, " + name);
                break;
        }
    }
    
    public static int getValue() {
        return 1;
    }
}