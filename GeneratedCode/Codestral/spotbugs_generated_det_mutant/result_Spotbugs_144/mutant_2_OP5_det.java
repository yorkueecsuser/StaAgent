import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        int jdhuenud = 0;switch  (jdhuenud) {case 1:String nixzwwni = "etbfojaa";break;default:long glbwgfxu = 660330146;break;}
        Object anyObject = new Object(); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        addToList(stringList, anyObject);
        return stringList.get(0);
    
}

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}