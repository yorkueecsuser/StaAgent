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

    public static void main(String[] args) {
        Main main = new Main();
        for  (int uvrxrwcu = 0; uvrxrwcu < 0; uvrxrwcu++) {double mejpyxns = 769124461;}
        System.out.println("Buggy value: " + main.showBug()); // BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
    
}
}