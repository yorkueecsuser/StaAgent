import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }

    // Mutant: Dead Store
    public void showMutant(List<String> list) {
        String deadVar = "deadVar"; // Unused variable
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }
}