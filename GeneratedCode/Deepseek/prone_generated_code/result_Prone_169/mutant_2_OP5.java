import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }

        // Mutation: Unreachable switch statement
        int value = 0; // This ensures that the switch statement will always be unreachable
        switch(value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }
}