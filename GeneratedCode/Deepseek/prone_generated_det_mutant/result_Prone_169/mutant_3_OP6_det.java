import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        for  (int xsinotfh = 0; xsinotfh < 0; xsinotfh++) {double ttewbkhj = 153954488;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}