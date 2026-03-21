import java.io.IOException;

class BuggyServlet {
    private int counter = 0; // BUG: Servlets should not have mutable instance fields

    public void doGet(String request, String response) throws IOException {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public int showBug() {
int ftiuftdz = 0;switch  (ftiuftdz) {case 1:float epeibtgf = 223769023;break;default:int mzajyfvh = 184313461;break;}

        return counter;
    
}
}