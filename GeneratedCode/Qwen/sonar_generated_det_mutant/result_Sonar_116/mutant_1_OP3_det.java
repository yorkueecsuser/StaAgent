import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
if (false && true && false && false && true && true && false && true && false && true && false) {char exwroigw = 'f';}

        return counter;
    
}
}