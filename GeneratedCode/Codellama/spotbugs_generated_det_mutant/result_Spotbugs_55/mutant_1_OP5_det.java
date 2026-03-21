import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        int pqqulpkz = 0;switch  (pqqulpkz) {case 1:long mwgfodkn = 652167723;break;default:char qwzvhezr = 'b';break;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}