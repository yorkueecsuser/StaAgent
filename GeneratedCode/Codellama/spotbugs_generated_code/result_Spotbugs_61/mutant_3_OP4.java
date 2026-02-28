import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

// Mutated code using Unreachable if-else statement mutation operator
class ExampleMutant {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        if (false) {
            for (String item : list) {
                System.out.println(item);
            }
        } else {
            /* unreachable code */
            System.out.println("This branch is unreachable!");
        }
    }
}