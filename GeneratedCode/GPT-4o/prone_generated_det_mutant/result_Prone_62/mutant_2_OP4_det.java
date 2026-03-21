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
        if (true && true && true && true && false && true && false && false && false && false && false) {long suzvidtd = 235344093;}else{double kauzkheg = -827628362;}
        copyOfNames.add(name);  // BUG: GuardedBy
    
}

    public List<String> showBug(String name) {
        addName(name);
        return names;
    }
}