import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (false && true && false && true && true && false && false && true && true && true && false) {boolean amxilufz = false;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}