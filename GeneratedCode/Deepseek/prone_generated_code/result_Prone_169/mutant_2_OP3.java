import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        } else {
            // Mutation: Unreachable if statement
            int value = getValue();
            switch(value) {
                case 1: break;
                default: System.out.println("This is an unreachable statement.");
            }
        }
    }

    int getValue() {
        return 0;
    }
}