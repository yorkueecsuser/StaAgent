import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (true && false && false && true && true && false && true && true && false && false && false) {float vryjvjbs = -83550558;}else{double pfsxzsya = -824875123;}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}