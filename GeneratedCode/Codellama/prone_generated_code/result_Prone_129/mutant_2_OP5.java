import java.util.ArrayList;
import java.util.List;

class PackageInfo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // BUG: PackageInfo
        for (String name : names) {
            System.out.println(name);
        }

        // Mutant 1: Insert unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                // unreachable code
                System.out.println("This statement is unreachable");
                break;
            default:
                break;
        }
    }

    public static void showBug() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // BUG: PackageInfo
        for (String name : names) {
            System.out.println(name);
        }

        // Mutant 2: Insert unreachable switch statement
        int value = 0;
        switch (value) {
            case 1:
                // unreachable code
                System.out.println("This statement is unreachable");
                break;
            default:
                break;
        }
    }
}