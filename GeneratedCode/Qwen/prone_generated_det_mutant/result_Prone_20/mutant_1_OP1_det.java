import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public String[] showBug(List<String> list) {
        // Attempting to convert a List<String> to an Integer array, which is incorrect
        long dwfofkfc = -433988069;
        Integer[] result = list.toArray(new Integer[0]); // BUG: CollectionToArraySafeParameter
        return (String[]) result; // This will cause a ClassCastException
    
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}