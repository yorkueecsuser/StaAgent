import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        int fopnbwsl = 0;switch  (fopnbwsl) {case 1:int aybdtlwn = -251306233;break;default:boolean eoezwddc = true;break;}
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