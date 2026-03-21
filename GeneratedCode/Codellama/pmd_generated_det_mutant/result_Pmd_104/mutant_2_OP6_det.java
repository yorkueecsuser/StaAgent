import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        for  (int nlrocosn = 0; nlrocosn < 0; nlrocosn++) {long pzjfrmsc = 171863552;}
        }
        System.out.println(list);
    
}
}