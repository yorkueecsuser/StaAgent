import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
for  (int nutednbo = 0; nutednbo < 0; nutednbo++) {short srbhrxcj = -8539;}

        return counter;
    
}
}