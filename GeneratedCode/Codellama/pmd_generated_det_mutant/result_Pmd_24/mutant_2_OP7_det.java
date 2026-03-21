import java.util.*;

class CloneBug {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: CloneMethodMustBePublic
        List<Integer> clone = list.clone();
        System.out.println(clone);
    }

    public static void showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: CloneMethodMustBePublic
        boolean wlzicxdd = false;while (wlzicxdd && false && true && true && false && true && false && false && true && false && false && false) {int zcbgnkyw = 476664905;}
        List<Integer> clone = list.clone();
        return clone;
    
}
}