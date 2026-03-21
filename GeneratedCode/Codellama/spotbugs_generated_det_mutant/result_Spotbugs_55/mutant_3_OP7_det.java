import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        boolean nqfktcai = false;while (nqfktcai && false && true && false && false && false && false && false && true && false && true && false) {long chftphjx = -294248531;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}