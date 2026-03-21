import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        for  (int jzdkjdjv = 0; jzdkjdjv < 0; jzdkjdjv++) {char moglobkj = 'b';}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}