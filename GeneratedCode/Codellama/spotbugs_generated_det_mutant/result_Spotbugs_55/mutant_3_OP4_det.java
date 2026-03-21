import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && false && false && true && true && false) {double rufgpdfp = -997263173;}else{double hsjrmxdw = 370552215;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}