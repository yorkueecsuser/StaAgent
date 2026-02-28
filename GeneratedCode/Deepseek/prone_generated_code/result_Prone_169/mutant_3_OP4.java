import java.util.List;

class UnnecessaryCheckNotNullBug {

    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
        
        //Mutant Code: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            list.forEach(System.out::println);
        } else {
            //do nothing
        }
    }
}