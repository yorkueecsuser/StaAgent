import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        for  (int kowsqmok = 0; kowsqmok < 0; kowsqmok++) {byte vcfzwfpw = 35;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}