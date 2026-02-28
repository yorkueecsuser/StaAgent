import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public String[] showBug(List<String> strings) {
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    public static void main(String[] args) {
        CollectionToArrayBug bugDemo = new CollectionToArrayBug();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        try {
            String[] result = bugDemo.showBug(stringList);
            for (String s : result) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // Mutant code with renaming
        CollectionToArrayBug x = new CollectionToArrayBug();
        List<String> y = new ArrayList<>();
        y.add("Hello");
        y.add("World");
        
        try {
            String[] z = x.showBug(y);
            for (String w : z) {
                System.out.println(w);
            }
        } catch (ClassCastException v) {
            System.out.println("Caught ClassCastException: " + v.getMessage());
        }
    }
}