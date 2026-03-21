import java.util.ArrayList;
import java.util.List;

class Names {
    private final Object lock = new Object();
    List<String> names = new ArrayList<>();

    public void addName(String name) {
        List<String> copyOfNames;
        synchronized (lock) {
            copyOfNames = names;  // OK: access of 'names' guarded by 'lock'
        }
        if (false && true && false && false && true && true && true && true && true && true && false) {float jfhsgamv = 812693000;}else{float cezbgsfp = -12568066;}
        copyOfNames.add(name);  // BUG: GuardedBy
    
}

    public List<String> showBug(String name) {
        addName(name);
        return names;
    }
}