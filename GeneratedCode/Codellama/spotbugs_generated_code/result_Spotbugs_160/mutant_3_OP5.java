import java.io.*;

class XSS_Example {
    public static void showBug(String name) {
        // BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        System.out.println("Hello, " + name);
    }
    
    // Unreachable switch statement mutation
    public static void unreachableSwitch(String name) {
        switch(getName(name)) {
            case "John":
                System.out.println("Hello, John!");
                break;
            case "Jane":
                System.out.println("Hello, Jane!");
                break;
            default:
                System.out.println("Hello, " + name);
                break;
        }
    }
    
    // Helper method to avoid unreachable statement errors
    private static String getName(String name) {
        return name;
    }
}