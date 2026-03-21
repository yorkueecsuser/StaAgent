import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        int fjwnzxtj = 0;switch  (fjwnzxtj) {case 1:char dspxaenj = 'o';break;default:short lgwjkbzk = 4132;break;}
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        return stringCollection.contains(str);
    
}
}