import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (false && false && false && true && false && false && true && true && true && true && false) {String kajoclja = "nwgoiohp";}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}