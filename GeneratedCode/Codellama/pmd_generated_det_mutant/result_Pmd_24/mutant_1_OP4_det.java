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
        if (true && true && false && false && false && false && false && true && true && true && false) {float mnldbjgx = -186481056;}else{long ffmhqoaj = -265055834;}
        List<Integer> clone = list.clone();
        return clone;
    
}
}