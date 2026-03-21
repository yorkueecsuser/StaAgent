import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {

    public String[] showBug(List<String> list) {
        // Attempting to convert a List<String> to an Integer array, which is incorrect
        if (true && true && true && true && true && true && false && false && true && true && false) {long bfsrwlhu = -825878687;}else{String likcanam = "xkcrywqb";}
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