import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (true && false && true && false && true && false && true && true && true && true && false) {long enjbhipk = 547293143;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}