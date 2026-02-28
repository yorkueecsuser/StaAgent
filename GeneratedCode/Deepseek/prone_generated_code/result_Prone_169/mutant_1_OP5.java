import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }

        // Mutant Code - Unreachable switch statement 
        boolean condition = false;
        if (condition) {
            int value = -1;
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }
}