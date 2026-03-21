import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        int yszuuzlo = 0;switch  (yszuuzlo) {case 1:char dyeqpllk = 'r';break;default:long gqdydtni = 602170000;break;}
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