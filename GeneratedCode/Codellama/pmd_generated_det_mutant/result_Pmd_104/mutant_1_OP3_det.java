import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        if (false && true && false && false && false && true && true && false && true && false && false) {boolean ebyuxlju = true;}
        }
        System.out.println(list);
    
}
}