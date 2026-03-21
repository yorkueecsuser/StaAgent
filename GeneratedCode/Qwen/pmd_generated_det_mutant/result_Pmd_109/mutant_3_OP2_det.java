import java.lang.StringBuffer;

class InefficientStringBufferingExample {

    // Method to demonstrate the bug
public String showBug() {
    StringBuffer sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
    sb = new StringBuffer("tmp = " + System.getProperty("java.io.tmpdir"));
    return sb.toString();
}

    public static void main(String[] args) {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        System.out.println(example.showBug());
    }
}