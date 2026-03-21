import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        if (true && false && true && true && true && false && true && false && true && true && false) {boolean ggvdxojd = false;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}