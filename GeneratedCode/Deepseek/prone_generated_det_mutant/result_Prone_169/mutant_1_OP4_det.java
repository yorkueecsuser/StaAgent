import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (true && true && false && false && false && true && false && true && false && false && false) {int ltlsvvza = -804058312;}else{String pqsgfsud = "pekrywnr";}
        if (list!= null) {
            list.forEach(System.out::println);
        }
    
}
}