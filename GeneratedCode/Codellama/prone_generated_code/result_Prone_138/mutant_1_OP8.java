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

// Mutant 1: Renaming variable "str" to "x"
class ProtoStringFieldReferenceEquality {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        for (String x : strings) {
            if (x == "hello") { // BUG: comparing protobuf fields of type String using reference equality
                System.out.println("Hello");
            } else {
                System.out.println("World");
            }
        }
    }

    public static String showBug(String x) {
        return x;
    }
}

// Mutant 2: Renaming variable "strings" to "strList"
class ProtoStringFieldReferenceEquality {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world");

        for (String str : strList) {
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