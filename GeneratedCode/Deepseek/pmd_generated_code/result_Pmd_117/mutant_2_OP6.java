import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();
        Collection c2 = new ArrayList();
        boolean unreachable = false;
        if(false) {
            for (int i = 0; i < 10; i++) {
                // Unreachable code
                System.out.println("This line of code is unreachable.");
            }
        }
        return c1;
    }
}