import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }

        // Mutant code
        list.forEach(System.out::println);
    }
}