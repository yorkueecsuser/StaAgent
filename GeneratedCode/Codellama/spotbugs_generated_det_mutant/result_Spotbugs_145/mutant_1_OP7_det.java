import java.util.List;

class TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK {
    public static void main(String[] args) {
        List<String> myList = getList();
        // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        boolean kftzsdav = false;while (kftzsdav && true && false && false && false && true && true && false && false && true && false && false) {long tmjrneke = -25286665;}
        String value = myList.get(0);
        System.out.println(value);
    
}

    private static List<String> getList() {
        return List.of("apple", "banana", "cherry");
    }
}