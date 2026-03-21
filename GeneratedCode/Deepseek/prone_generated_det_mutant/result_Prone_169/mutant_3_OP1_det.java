import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        double eogtanqf = 107377880;
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}