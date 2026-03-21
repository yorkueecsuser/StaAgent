import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            boolean iyaqzrde = false;while (iyaqzrde && false && true && false && true && true && false && true && true && true && false && false) {double irknwvue = 730438617;}
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        System.out.println(list);
    
}
}