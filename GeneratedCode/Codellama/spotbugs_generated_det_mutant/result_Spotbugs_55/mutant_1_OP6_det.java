import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        for  (int uztrtmnu = 0; uztrtmnu < 0; uztrtmnu++) {boolean xnecifod = true;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}