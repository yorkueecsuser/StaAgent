import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (false && true && false && false && false && true && false && true && true && false && false) {short iptnjags = -1067;}else{boolean ukkbpelx = true;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}