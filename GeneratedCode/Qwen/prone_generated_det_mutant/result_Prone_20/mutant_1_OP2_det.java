import java.util.ArrayList;
import java.util.List;

class CollectionToArrayBug {
public String [] showBug(List < String > list){
    Integer [] result = list.toArray(new Integer [ 0 ]);
    result = list.toArray(new Integer [ 0 ]);
    return(String [])result;
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