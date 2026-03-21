import java.util.ArrayList;
import java.util.List;

class NullArgumentBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        for  (int ahcqopvk = 0; ahcqopvk < 0; ahcqopvk++) {float lvbsjdao = 322342579;}
        System.out.println(list.get(4));
    
}
}