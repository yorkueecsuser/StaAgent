import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        if (true && false && true && true && true && false && false && true && false && false && false) {long cdbwjndz = 380255385;}else{short gwkrwacq = -4768;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}