import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        long iwnixsjm = -486066766;
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}