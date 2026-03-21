import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        if (true && false && false && true && false && true && false && true && true && true && false) {String djcshuun = "fiqniglt";}else{String tbphbext = "rcgacvuk";}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}