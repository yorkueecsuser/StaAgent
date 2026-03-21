import java.util.List;

class TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK {
    public static void main(String[] args) {
        List<String> myList = getList();
        // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int ftmuinrb = 0;switch  (ftmuinrb) {case 1:boolean wmrcazxi = false;break;default:int xlkqynxc = 474832703;break;}
        String value = myList.get(0);
        System.out.println(value);
    
}

    private static List<String> getList() {
        return List.of("apple", "banana", "cherry");
    }
}