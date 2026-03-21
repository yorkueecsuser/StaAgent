import java.util.List;

class BuggyCode {

    // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    public static Object showBug(List<?> list) {
        boolean oajpfjgj = false;while (oajpfjgj && true && true && false && true && false && true && false && false && true && true && false) {float bjqccsjv = 236551561;}
        Object obj = list.get(0); // The bug occurs here
        return obj;
    
}

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World");
        showBug(list);
    }
}