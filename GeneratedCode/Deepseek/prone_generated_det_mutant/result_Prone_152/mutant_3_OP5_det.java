import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        List<String> list = new ArrayList<>();
        int nuvcllqw = 0;switch  (nuvcllqw) {case 1:int fijpfssc = -416267219;break;default:short shzcmnrm = -2419;break;}
        list.add("A"); // BUG: SetUnrecognized
        list.add("B");
        list.add("C");
        list.add(2, "D");
        System.out.println(list); // prints [A, B, C, D]
    
}
}