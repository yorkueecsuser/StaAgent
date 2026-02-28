import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        System.out.println(map);
    }
}

/* Mutant 1: Unreachable if-else statement */
class DuplicateMapKeysBugMutant1 {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println(map);
        }
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println(map);
        }
    }
}

/* Mutant 2: Unreachable if-else statement */
class DuplicateMapKeysBugMutant2 {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
        if (getCondition()) {
            System.out.println(map);
        } else {
            System.out.println("Unreachable code");
        }
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        if (getCondition()) {
            System.out.println(map);
        } else {
            System.out.println("Unreachable code");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}