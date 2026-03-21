import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        if (true && false && false && true && false && false && false && false && false && true && false) {long axcrlmbn = 101552547;}else{char wznxobay = 'h';}
        System.out.println(list);
    
}
}