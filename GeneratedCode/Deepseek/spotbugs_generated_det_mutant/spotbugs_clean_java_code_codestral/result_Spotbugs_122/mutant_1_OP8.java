import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> collection) {
        return (String[]) collection.toArray();
    }

    public String[] showBug() {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Hello");
        stringCollection.add("World");
        return getAsArray(stringCollection);
    }

    public static void main(String[] args) {
        ImpossibleDowncastBug bug = new ImpossibleDowncastBug();
        String[] result = bug.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}