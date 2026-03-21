import java.util.*;

class BugTest {
public Collection showBug() {
    Collection c1 = new Vector();
    Collection c2 = new ArrayList();
    c2 = new ArrayList();
    return c1;
}
}