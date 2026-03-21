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
        int znkdajyr = 0;switch  (znkdajyr) {case 1:long pvfiltyj = -777256197;break;default:String mlujghzv = "whmjysgb";break;}
        copyOfNames.add(name);  // BUG: GuardedBy
    
}

    public List<String> showBug(String name) {
        addName(name);
        return names;
    }
}