import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
int bibgpnwj = 0;switch  (bibgpnwj) {case 1:float eesxfwlt = 603448979;break;default:short qtmuhhcl = -7598;break;}

        return counter;
    
}
}