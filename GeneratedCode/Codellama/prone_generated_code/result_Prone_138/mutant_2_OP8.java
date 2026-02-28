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

// Mutant 1: Renaming variable "str" to "s" in method "showBug"
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

    public static String showBug(String s) {
        return s;
    }
}

// Mutant 2: Renaming variable "strings" to "stringList" in method "main"
class ProtoStringFieldReferenceEquality {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");

        for (String str : stringList) {
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