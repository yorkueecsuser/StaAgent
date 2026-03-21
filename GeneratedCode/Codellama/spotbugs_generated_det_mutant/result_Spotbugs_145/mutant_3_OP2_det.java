import java.util.List;

class TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK {
public static void main(String [] args){
    List < String > myList = getList();
    String value = myList.get(0);
    value = myList.get(0);
    System.out.println(value);
}

    private static List<String> getList() {
        return List.of("apple", "banana", "cherry");
    }
}