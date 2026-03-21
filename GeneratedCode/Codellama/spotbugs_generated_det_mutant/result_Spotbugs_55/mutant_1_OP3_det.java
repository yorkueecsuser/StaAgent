import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        if (false && true && true && false && true && true && true && false && false && true && false) {char latokaap = 'c';}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}