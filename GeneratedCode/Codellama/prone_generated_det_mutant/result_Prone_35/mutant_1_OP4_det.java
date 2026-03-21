import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        if (false && false && false && true && false && true && false && false && false && false && false) {long jasvsfgb = 290640474;}else{int drugteog = -267830592;}
        System.out.println(list);
    
}
}