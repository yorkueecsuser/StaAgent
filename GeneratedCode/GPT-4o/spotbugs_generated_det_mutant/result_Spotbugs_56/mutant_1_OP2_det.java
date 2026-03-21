import java.io.IOException;
import java.io.OutputStream;

class BugExample {
public String showBug() {
    OutputStream os = null;
    os = null;
    try { os.close(); } catch(IOException e){ return "IOException occurred while closing OutputStream: " + e.getMessage(); } catch(NullPointerException e){ return "Caught NullPointerException: " + e.getMessage(); }
    return "OutputStream closed successfully";
}

    public static void main(String[] args) {
        BugExample example = new BugExample();
        System.out.println(example.showBug());
    }
}