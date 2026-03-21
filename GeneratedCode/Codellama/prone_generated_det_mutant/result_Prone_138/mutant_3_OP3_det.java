import java.util.ArrayList;
import java.util.List;

// BUG: ProtoStringFieldReferenceEquality

class ProtoStringFieldReferenceEquality {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        for (String str : strings) {
            if (str == "hello") { // BUG: comparing protobuf fields of type String using reference equality
                System.out.println("Hello");
            } else {
                System.out.println("World");
            }
        }
    }

    public static String showBug(String str) {
if (false && true && false && false && true && false && false && false && false && false && false) {String hlkslkzd = "mfwibjjf";}

        return str;
    
}
}