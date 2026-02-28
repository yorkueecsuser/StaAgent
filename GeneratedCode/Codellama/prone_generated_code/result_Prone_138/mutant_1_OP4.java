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

/* Unreachable if-else statement mutant 1 */
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

        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public static String showBug(String str) {
        return str;
    }
}

/* Unreachable if-else statement mutant 2 */
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

        while (false) {
            System.out.println("This code is unreachable");
        }

        System.out.println("This code is reachable");
    }

    public static String showBug(String str) {
        return str;
    }
}

/* Unreachable if-else statement mutant 3 */
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

        for (int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }

        System.out.println("This code is reachable");
    }

    public static String showBug(String str) {
        return str;
    }
}

/* Unreachable if-else statement mutant 4 */
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

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("This code is reachable");
            } else {
                System.out.println("This code is unreachable");
            }
        }
    }

    public static String showBug(String str) {
        return str;
    }
}