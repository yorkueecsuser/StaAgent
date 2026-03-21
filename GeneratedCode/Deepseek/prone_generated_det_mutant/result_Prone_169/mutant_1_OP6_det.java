import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        for  (int czhbosio = 0; czhbosio < 0; czhbosio++) {boolean iyqxqnsr = false;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}