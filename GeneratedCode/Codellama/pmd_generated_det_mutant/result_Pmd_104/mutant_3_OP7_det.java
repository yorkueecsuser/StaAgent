import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        boolean bzifvxga = false;while (bzifvxga && false && true && false && true && false && true && true && false && false && false && false) {int dasksncm = -265966262;}
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        System.out.println(list);
    
}
}