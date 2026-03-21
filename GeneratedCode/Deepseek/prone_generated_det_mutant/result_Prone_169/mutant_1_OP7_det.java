import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        boolean vsvrseit = false;while (vsvrseit && false && true && false && false && false && true && true && true && true && false && false) {float eunihrtj = 944735797;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}