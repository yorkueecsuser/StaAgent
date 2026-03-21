import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
int pvwnftll = 0;switch  (pvwnftll) {case 1:int dsrflruw = 794238289;break;default:long aefcygcx = -11765534;break;}

        return counter;
    
}
}