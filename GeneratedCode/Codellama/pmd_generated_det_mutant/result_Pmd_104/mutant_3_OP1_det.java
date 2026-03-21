import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        char hponblbl = 'm';
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        System.out.println(list);
    
}
}