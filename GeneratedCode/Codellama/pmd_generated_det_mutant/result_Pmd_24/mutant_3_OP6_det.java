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
        for  (int ftgnymlv = 0; ftgnymlv < 0; ftgnymlv++) {int iftghyix = 12437922;}
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: CloneMethodMustBePublic
        List<Integer> clone = list.clone();
        return clone;
    
}
}