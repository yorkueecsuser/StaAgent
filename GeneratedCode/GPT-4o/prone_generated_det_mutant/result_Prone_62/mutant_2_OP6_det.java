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
        for  (int dmfcmugf = 0; dmfcmugf < 0; dmfcmugf++) {double tpzxiaup = -220736266;}
        copyOfNames.add(name);  // BUG: GuardedBy
    
}

    public List<String> showBug(String name) {
        addName(name);
        return names;
    }
}