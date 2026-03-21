import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        int irtadswy = 0;switch  (irtadswy) {case 1:short dtfzhaet = 4303;break;default:char dlpingij = 'u';break;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}