import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
if (false && false && false && false && true && true && false && true && false && false && false) {double byzdifwl = -200201907;}else{String oehylssy = "kmxgqpxl";}

        return counter;
    
}
}