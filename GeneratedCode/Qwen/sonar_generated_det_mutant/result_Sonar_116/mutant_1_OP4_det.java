import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
if (true && true && true && true && false && true && false && true && true && true && false) {String njnmziyk = "avssjrgv";}else{boolean xelyhtye = false;}

        return counter;
    
}
}