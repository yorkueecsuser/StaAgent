import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        double hwogqith = 386657357;
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}