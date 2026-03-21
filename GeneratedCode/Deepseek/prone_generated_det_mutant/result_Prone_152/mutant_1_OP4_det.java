import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        List<String> list = new ArrayList<>();
        if (false && false && true && true && true && true && true && false && true && false && false) {boolean qhihljsx = true;}else{float nanrqnvn = -562778557;}
        list.add("A"); // BUG: SetUnrecognized
        list.add("B");
        list.add("C");
        list.add(2, "D");
        System.out.println(list); // prints [A, B, C, D]
    
}
}