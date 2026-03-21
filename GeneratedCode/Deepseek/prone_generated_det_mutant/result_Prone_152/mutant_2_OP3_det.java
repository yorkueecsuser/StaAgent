import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        List<String> list = new ArrayList<>();
        if (true && false && true && false && true && true && true && false && true && false && false) {char nxfkvtms = 'd';}
        list.add("A"); // BUG: SetUnrecognized
        list.add("B");
        list.add("C");
        list.add(2, "D");
        System.out.println(list); // prints [A, B, C, D]
    
}
}