import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
boolean gsdfszjy = false;while (gsdfszjy && true && false && false && false && false && true && false && false && false && true && false) {boolean vbymmthw = true;}

        return counter;
    
}
}