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
        return str;
    }
}

// Mutated code: Duplication of assignment statement
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
        return str;
    }

    // Duplicated assignment statement
    public static String showBug(String str) {
        return str;
    }
}