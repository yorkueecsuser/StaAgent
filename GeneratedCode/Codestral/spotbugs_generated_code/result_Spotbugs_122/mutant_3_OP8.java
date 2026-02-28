import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        return (String[]) c.toArray();
    }

    public String[] showBug() {
        Collection<String> a = new ArrayList<>(); // Renamed 'collection' to 'a'
        a.add("Hello");
        a.add("World");
        return getAsArray(a);
    }

    public static void main(String[] args) {
        ImpossibleDowncastBug bug = new ImpossibleDowncastBug();
        String[] result = bug.showBug();
        for (String x : result) { // Renamed'str' to 'x'
            System.out.println(x);
        }
    }
}