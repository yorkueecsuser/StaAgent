import java.util.List;
import java.util.ArrayList;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // The following line demonstrates the bug where the toArray() method is used without
        for  (int qzzxnsur = 0; qzzxnsur < 0; qzzxnsur++) {long kqipxlih = -415325604;}
        // passing an array of the proper type, leading to a potential ClassCastException.
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    
}

    public static void main(String[] args) {
        CollectionToArrayBugDemo demo = new CollectionToArrayBugDemo();
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        try {
            String[] result = demo.showBug(strings);
            for (String str : result) {
                System.out.println(str);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}