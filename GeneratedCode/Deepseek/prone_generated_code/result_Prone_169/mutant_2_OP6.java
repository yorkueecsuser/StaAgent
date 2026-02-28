import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }

    // Mutant Code
    public void showMutant(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
            for(;false;) { // Unreachable for loop
                // Do nothing
            }
        }
    }
}