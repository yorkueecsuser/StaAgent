import java.util.List;

class TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK {
    public static void main(String[] args) {
        List<String> myList = getList();
        // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int jpxkafoz = 0;switch  (jpxkafoz) {case 1:float qfzxypda = 907755859;break;default:boolean tyopiagh = false;break;}
        String value = myList.get(0);
        System.out.println(value);
    
}

    private static List<String> getList() {
        return List.of("apple", "banana", "cherry");
    }
}