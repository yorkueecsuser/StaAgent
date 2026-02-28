import java.io.IOException;

class MutableFieldServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String req, String resp) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
        return counter;
    }
}