import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        if (false && true && true && false && true && false && true && false && false && false && false) {short ftdegqjp = 5035;}else{String irxwmccv = "atgsdeek";}
        System.out.println(list);
    
}
}