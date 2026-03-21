import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
if (false && false && true && false && true && true && false && false && true && false && false) {String dymucple = "vqgwtzez";}

        return counter;
    
}
}