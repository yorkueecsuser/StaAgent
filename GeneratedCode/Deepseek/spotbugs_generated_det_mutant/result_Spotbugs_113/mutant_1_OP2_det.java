import java.util.ArrayList;
import java.util.List;

class Main {
    private int number = 10;

    public int showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i : list) {
            number += i;
        }
        return number;
    }
public static void main(String [] args){
    Main main = new Main();
    main = new Main();
    System.out.println("Buggy value: " + main.showBug());
}
}