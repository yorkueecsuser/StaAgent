import java.util.List;

class UnreachableWhileLoopBug {

    // Mutant: Unreachable While loop
    public void showBug(List<String> list) {
        boolean condition = false;
        while (condition) {
            if (list!= null) {
                list.forEach(System.out::println);
            }
        }
    }
}