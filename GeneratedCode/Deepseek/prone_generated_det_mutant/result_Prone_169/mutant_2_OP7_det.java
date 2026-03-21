import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        boolean wubipzuj = false;while (wubipzuj && false && true && false && true && false && true && false && true && true && false && false) {float kwifokio = 483124677;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}