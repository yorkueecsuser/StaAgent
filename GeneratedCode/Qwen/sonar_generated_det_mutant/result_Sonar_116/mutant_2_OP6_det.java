import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
for  (int dqznsxta = 0; dqznsxta < 0; dqznsxta++) {short xkgjbkqx = -6359;}

        return counter;
    
}
}