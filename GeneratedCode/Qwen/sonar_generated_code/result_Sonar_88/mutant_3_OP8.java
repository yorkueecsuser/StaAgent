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

        // Mutated code
        CollectionToArrayBug bugDeo = new CollectionToArrayBug();
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");
        
        try {
            String[] res = bugDeo.showBug(strList);
            for (String t : res) {
                System.out.println(t);
            }
        } catch (ClassCastException f) {
            System.out.println("Caught ClassCastException: " + f.getMessage());
        }
    }
}