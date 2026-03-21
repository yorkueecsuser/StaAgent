import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        if (false && false && false && false && true && true && true && true && false && false && false) {boolean comujjos = true;}
        }
        System.out.println(list);
    
}
}