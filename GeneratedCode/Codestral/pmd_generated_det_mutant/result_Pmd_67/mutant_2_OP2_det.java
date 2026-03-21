import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
public List < String > getNames() {
    List < String > names = null;
    boolean noNamesAvailable = true;
    noNamesAvailable = true;
    if(noNamesAvailable){ return names; } else { names = new ArrayList < >(); return names; }
}

    public void showBug() {
        List<String> names = getNames();
        if (names!= null) {
            System.out.println("Number of names: " + names.size());
        } else {
            System.out.println("Names list is null!");
        }
    }
}