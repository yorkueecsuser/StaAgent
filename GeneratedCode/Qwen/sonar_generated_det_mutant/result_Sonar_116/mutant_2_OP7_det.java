import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
boolean ujtvamkp = false;while (ujtvamkp && false && false && false && false && true && false && false && true && true && false && false) {int etfsrbkh = -123742488;}

        return counter;
    
}
}