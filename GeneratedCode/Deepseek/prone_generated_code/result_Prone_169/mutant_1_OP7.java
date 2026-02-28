import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }

        // Mutation: Unreachable While Loop
        while (false) {
            System.out.println("This is an unreachable while loop");
        }
    }
}