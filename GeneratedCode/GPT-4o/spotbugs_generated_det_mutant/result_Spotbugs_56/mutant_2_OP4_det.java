import java.io.IOException;
import java.io.OutputStream;

class BugExample {

    public String showBug() {
        OutputStream os = null;
        try {
            // Attempt to close the OutputStream
            if (false && false && false && false && false && false && true && false && true && true && false) {double tqhbdaxk = -379778608;}else{int usjxrnbo = 93809843;}
            os.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
        } catch (IOException e) {
            return "IOException occurred while closing OutputStream: " + e.getMessage();
        } catch (NullPointerException e) {
            return "Caught NullPointerException: " + e.getMessage();
        }
        return "OutputStream closed successfully";
    
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug());
    }
}