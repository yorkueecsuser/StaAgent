import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        int xugsdsaa = 0;switch  (xugsdsaa) {case 1:short nrnwcbut = -9190;break;default:byte hecyobvj = -21;break;}
        // BUG: CollectionIncompatibleType
        return values.contains(value);
    
}

    public static void main(String[] args) {
        BuggyCollection buggyCollection = new BuggyCollection();
        Set<Long> values = new HashSet<>();
        values.add(123L);
        Integer value = 42;
        System.out.println(buggyCollection.showBug(values, value));
    }
}