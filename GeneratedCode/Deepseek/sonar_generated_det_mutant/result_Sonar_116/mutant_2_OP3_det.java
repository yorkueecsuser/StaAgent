import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MutableServlet {

    private List<String> mutableField = new ArrayList<>();

    public void doGet() throws IOException { // Removed parameters since they are not needed
        mutableField.add("bug");
    }

    public List<String> showBug() {
if (true && true && false && true && true && false && false && false && false && false && false) {float jinsitoc = 108651936;}

        return mutableField; // BUG: Servlets should not have mutable instance fields
    
}

    public static void main(String[] args) {
        MutableServlet servlet = new MutableServlet();
        try {
            servlet.doGet();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(servlet.showBug());
    }
}