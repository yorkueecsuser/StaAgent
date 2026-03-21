import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        if (true && true && true && false && false && false && false && false && true && false && false) {String lbcrbanw = "zdiiwndj";}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}