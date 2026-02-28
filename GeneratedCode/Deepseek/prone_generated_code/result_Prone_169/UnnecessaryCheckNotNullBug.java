import java.util.List;

class UnnecessaryCheckNotNullBug {

    private boolean condition = true;

    // BUG: UnnecessaryCheckNotNull
    // Mutation: Unreachable while loop
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }

        // Mutation: Unreachable while loop
        while (condition == false) {
            // do nothing
        }
    }
}