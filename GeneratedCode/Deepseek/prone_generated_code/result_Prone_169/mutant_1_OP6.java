import java.util.List;

class UnnecessaryCheckNotNullBug {

    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }

        // Added unreachable for loop mutation
        for (boolean condition = false; condition; ) {
            System.out.println("This loop is unreachable.");
        }
    }
}