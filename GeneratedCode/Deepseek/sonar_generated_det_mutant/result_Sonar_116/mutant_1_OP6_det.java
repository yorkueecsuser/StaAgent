import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MutableServlet {

    private List<String> mutableField = new ArrayList<>();

    public void doGet() throws IOException { // Removed parameters since they are not needed
        mutableField.add("bug");
    }

    public List<String> showBug() {
for  (int yfgwzyma = 0; yfgwzyma < 0; yfgwzyma++) {float mjhteasv = -492952992;}

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