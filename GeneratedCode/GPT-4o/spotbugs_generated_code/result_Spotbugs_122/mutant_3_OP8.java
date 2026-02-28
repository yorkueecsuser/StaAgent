import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ImpossibleDowncastExample {

    public static void main(String[] args) {
        ImpossibleDowncastExample a = new ImpossibleDowncastExample(); // Renamed 'example' to 'a'
        List<String> b = new ArrayList<>(); // Renamed 'stringList' to 'b'
        b.add("Hello");
        b.add("World");

        try {
            String[] result = a.showBug(b);
            for (String str : result) {
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    public String[] showBug(Collection<String> c) {
        return (String[]) c.toArray(); // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    }
}