import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
if (false && true && true && true && true && true && false && false && true && true && false) {long bmwyvnry = 730045455;}else{short iiwysqqm = -6791;}

        return counter;
    
}
}