import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        List<String> list = new ArrayList<>();
        for  (int uuvsjmro = 0; uuvsjmro < 0; uuvsjmro++) {String aydkjdca = "ofgmrbyh";}
        list.add("A"); // BUG: SetUnrecognized
        list.add("B");
        list.add("C");
        list.add(2, "D");
        System.out.println(list); // prints [A, B, C, D]
    
}
}