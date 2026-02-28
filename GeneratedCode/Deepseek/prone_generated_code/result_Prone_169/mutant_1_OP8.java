import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }

    public void showBug_mutant(List<String> a) {
        if (a!= null) {
            a.forEach(System.out::println);
        }
    }
}