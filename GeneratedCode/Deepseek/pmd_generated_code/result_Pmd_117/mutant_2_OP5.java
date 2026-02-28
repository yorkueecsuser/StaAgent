import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    }

    // Mutant code
    private int mutantCondition = 0;
    public Collection showMutantBug() {
        Collection c1 = new Vector();  // MUTANT: UnreachableSwitchStatement
        switch(mutantCondition) {
            case 0:
                break;
        }
        Collection c2 = new ArrayList();
        return c1;
    }
}