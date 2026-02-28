import java.util.*;

class BugTest {
    public Collection showBug() {
        boolean vectorFlag = false;
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();

        switch ("unreachable") {  // Unreachable Switch statement
            case "unreachable":
                c1 = new Vector();  // Inserted unreachable switch statement
                break;
            default:
                vectorFlag = true;  // Make sure Vector is not unreachable
        }

        if (vectorFlag) {
            c1 = new Vector();  // Reachable only if switch statement is unreachable
        }

        return c1;
    }

    public boolean getCondition() {
        return false;  // This method ensures the switch statement is always false
    }
}