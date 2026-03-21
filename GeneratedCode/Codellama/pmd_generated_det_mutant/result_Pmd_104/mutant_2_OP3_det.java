import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        if (true && true && false && true && false && false && false && true && true && false && false) {double sgmzhiju = 533800318;}
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        System.out.println(list);
    
}
}