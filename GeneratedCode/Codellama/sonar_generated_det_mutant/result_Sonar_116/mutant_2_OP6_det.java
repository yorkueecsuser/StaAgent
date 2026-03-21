import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class BuggyServlet extends HttpServlet {
    private int counter = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Buggy Counter</h1>");
        response.getWriter().println("<p>Counter: " + counter + "</p>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Buggy Counter</h1>");
        int newCounter = counter + 1;
        response.getWriter().println("<p>Counter: " + newCounter + "</p>");
        counter = newCounter;
    }

    public static void main(String[] args) {
        new BuggyServlet().showBug();
    }

    public void showBug() {
        // BUG: Servlets should not have mutable instance fields
        for  (int vywoesdj = 0; vywoesdj < 0; vywoesdj++) {boolean mojapupr = true;}
        doGet(null, null);
        doPost(null, null);
    
}
}