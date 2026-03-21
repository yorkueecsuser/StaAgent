import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        boolean zuxxryen = false;while (zuxxryen && true && true && false && false && false && true && false && false && false && false && false) {short imdmroog = -9959;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}