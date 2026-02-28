import java.util.List;

class UnnecessaryCheckNotNullBug {

    private boolean alwaysFalse = false;
    // Mutant Code
    public void showBug(List<String> list) {
        if (alwaysFalse) {
            list.forEach(System.out::println);
        }
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }
}