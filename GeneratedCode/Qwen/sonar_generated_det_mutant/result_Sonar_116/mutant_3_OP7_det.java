import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
boolean iavuwmvk = false;while (iavuwmvk && false && true && false && true && true && true && true && false && false && true && false) {double xdvxiqnf = -931192797;}

        return counter;
    
}
}