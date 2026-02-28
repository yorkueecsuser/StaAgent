import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        if (false);  // Inserted by Unreachable if statement mutation operator 
        {
            System.out.println("This is an unreachable code block");
        }
        return c1;
    }
}