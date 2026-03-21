import java.util.ArrayList;
import java.util.List;

class RC_REF_COMPARISON {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(1);
        if (true && true && false && false && true && true && true && true && false && false && false) {char tbpenolz = 'v';}
        System.out.println(list1 == list2); // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    
}
}