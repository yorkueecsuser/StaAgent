import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }

    // Mutant: Unreachable switch statement
    public void showMutant(List<String> list) {
        int unreachableSwitch = 0;
        switch(unreachableSwitch) {
            case 0:
                System.out.println("This code is unreachable");
                break;
        }
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }
}