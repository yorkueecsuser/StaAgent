import java.util.List;
import java.util.ArrayList;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // The following line demonstrates the bug where the toArray() method is used without
        // passing an array of the proper type, leading to a potential ClassCastException.
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    public static void main(String[] args) {
        CollectionToArrayBugDemo demo = new CollectionToArrayBugDemo();
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        try {
            String[] tlifrels = demo.showBug(strings);
            for (String str : tlifrels) {
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}