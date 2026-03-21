import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (true && false && false && true && true && false && false && false && false && true && false) {float avevridx = 550266791;}else{long kvzuyask = 838618032;}
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        System.out.println(list);
    
}
}