import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        boolean ggxxdpor = false;while (ggxxdpor && true && false && false && true && true && true && false && true && true && true && false) {char rqdqfbuw = 'b';}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}