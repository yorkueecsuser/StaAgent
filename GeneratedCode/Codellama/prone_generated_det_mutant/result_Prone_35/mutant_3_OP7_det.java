import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        boolean rkxvexnv = false;while (rkxvexnv && true && true && true && true && true && false && true && false && false && false && false) {float vznnultk = 972596937;}
        System.out.println(list);
    
}
}